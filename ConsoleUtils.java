

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * M�todos utilit�rios de console
 */
public class ConsoleUtils {

	/**
	 * Representa uma letra inv�lida digitada pelo usu�rio
	 */
	public static final char LETRA_INVALIDA = '|';
	
	/**
	 * L� uma letra do console
	 * 
	 * @return Letra lida
	 * @throws CaractereInvalidoException
	 *             Pode ser lan�ada em tr�s casos: se nada for digitado, se mais
	 *             de uma letra for digitada e se o caractere digitado n�o for
	 *             uma letra de A a Z
	 * @throws {@link IOException} Se houver algum problema de I/O relacionado �
	 *         leitura do console
	 */
	public static char lerLetra() {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			// L� a linha do teclado
			String linha = reader.readLine();

			// A linha n�o pode ser vazia
			if (linha.trim().isEmpty()) {
				return LETRA_INVALIDA;
			}

			// A linha n�o pode conter mais de um caractere
			if (linha.length() > 1) {
				return LETRA_INVALIDA;
			}

			// Extrai o caractere digitado, convertida para mai�scula
			char letra = linha.toUpperCase().charAt(0);

			// O caractere deve ser uma letra
			if (!Character.isLetter(letra)) {
				return LETRA_INVALIDA;
			}

			return letra;

		} catch (IOException e) {
			return LETRA_INVALIDA;
		}
	}
}
