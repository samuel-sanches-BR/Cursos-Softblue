<?php

    // Editor de arquivos PHP:
    // Komodo EDIT
    // https://www.activestate.com/komodo-ide/downloads/edit
    
    // Baixar o MySQL Workbench

   
    
     /* CÓDIGO USADO NO MYSQL:
       
        CREATE DATABASE bluesenhas;

        USE bluesenhas;
        
        CREATE TABLE senhas
        (
            id INT NOT NULL AUTO_INCREMENT,
            nome VARCHAR(128) NOT NULL,
            tipo VARCHAR(64) NOT NULL,
            mudar VARCHAR(3) NOT NULL,
            url VARCHAR(128) NOT NULL,
            email VARCHAR(128) NOT NULL,
            usuario VARCHAR(32) NOT NULL,
            senha VARCHAR(32) NOT NULL,
            PRIMARY KEY(id)
        );
        
        SELECT * FROM senhas;
        */
    
    
    $resultado = "";
    
    // Validando nome...
    if( !isset($_POST["nome"]) || strlen($_POST["nome"]) < 5 || strlen($_POST["nome"]) > 128)
    {
        $resultado = "O nome da senha não é válido.";
    }
    
    // Validando tipo...
    else if( isset($_POST["tipo"]) == false || $_POST["tipo"] == "Selecione..." )
    {
        $resultado = "O tipo da senha não é válido.";
    }
    
    // Validando tempo de mudança..
    else if( isset($_POST["mudar"]) == false || ($_POST["mudar"] != 's' && $_POST["mudar"] != 'n'))
    {
        // Exemplo de comentário...
        $resultado = "Mudar senha da cada 6 meses inválido.";
    }
    else if( isset($_POST["url"]) == false || filter_var($_POST["url"], FILTER_VALIDATE_URL) == false )
    {
        $resultado = "URL inválida.";
    }
    else if( isset($_POST["email"]) == false || filter_var($_POST["email"], FILTER_VALIDATE_EMAIL) == false)
    {
        $resultado = "E-mail inválido.";
    }
    else if( isset($_POST["usuario"]) == false || strlen($_POST["usuario"]) < 5)
    {
        $resultado = "Nome de usuário inválido.";
    }
    else if( isset($_POST["senha"]) == false || strlen($_POST["senha"]) < 6)
    {
        $resultado = "Senha inválida.";
    }
    else
    {
        $resultado = "<font color=green>Sucesso!</font>";
        
      try
        {
            $connection = new PDO("mysql:host=localhost;dbname=bluesenhas", "root", "123456");
            $connection->exec("set names utf8");
        }
        catch(PDOException $e)
        {
            echo "Falha: " . $e->getMessage();
            exit();
        }
        
        $sql = "INSERT INTO senhas (nome, tipo, mudar, url, email, usuario, senha)
                VALUES (?, ?, ?, ?, ?, ?, ?)";
                                
        $stmt = $connection->prepare($sql);
        
        $stmt->bindParam(1, $_POST["nome"]);
        $stmt->bindParam(2, $_POST["tipo"]);
        $stmt->bindParam(3, $_POST["mudar"]);
        $stmt->bindParam(4, $_POST["url"]);
        $stmt->bindParam(5, $_POST["email"]);
        $stmt->bindParam(6, $_POST["usuario"]);
        $stmt->bindParam(7, $_POST["senha"]);
        
        $stmt->execute();
        
        if( $stmt->errorCode() != "00000" )
        {
            $resultado = "Erro código " . $stmt->errorCode() . ": ";
            $resultado .= implode(",", $stmt->errorInfo());
        }
     
    }
    
    echo $resultado;
    
?>