

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Métodos utilitários de console
 */
public class ConsoleUtils {

	/**
	 * Representa uma letra inválida digitada pelo usuário
	 */
	public static final char LETRA_INVALIDA = '|';
	
	/**
	 * Lê uma letra do console
	 * 
	 * @return Letra lida
	 * @throws CaractereInvalidoException
	 *             Pode ser lançada em três casos: se nada for digitado, se mais
	 *             de uma letra for digitada e se o caractere digitado não for
	 *             uma letra de A a Z
	 * @throws {@link IOException} Se houver algum problema de I/O relacionado à
	 *         leitura do console
	 */
	public static char lerLetra() {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			// Lê a linha do teclado
			String linha = reader.readLine();

			// A linha não pode ser vazia
			if (linha.trim().isEmpty()) {
				return LETRA_INVALIDA;
			}

			// A linha não pode conter mais de um caractere
			if (linha.length() > 1) {
				return LETRA_INVALIDA;
			}

			// Extrai o caractere digitado, convertida para maiúscula
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
