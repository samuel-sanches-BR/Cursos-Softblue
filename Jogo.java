import java.util.HashSet;
import java.util.Set;

public class Jogo {

	private static final int MAX_ERROS = 5;
	
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.iniciar();
	}
	
	void iniciar() {
		Set<Character> letrasUsadas = new HashSet<>();
		
		int erros = 0;
		
		Dicionario dicionario = new Dicionario();
		Palavra palavra = dicionario.proximaPalavra();
		
		System.out.println("Bem-vindo ao Jogo da Forca!");
		System.out.println("A palavra tem " + palavra.tamanho() + " letras");
		
		while (true) {
			System.out.println(palavra);
			System.out.println();
			
			System.out.print("Digite uma letra: ");
			
			char letra = ConsoleUtils.lerLetra();
			
			if (letra == ConsoleUtils.LETRA_INVALIDA) {
				System.out.println("Digite uma letra v�lida");
				continue;
			}
			
			if (letrasUsadas.contains(letra)) {
				System.out.println("Esta letra j� foi utilizada");
				continue;
			}
			
			letrasUsadas.add(letra);
			
			if (palavra.possuiLetra(letra)) {
				System.out.println("Voc� acertou uma letra!");
			
			} else {
				erros++;
				
				if (erros < MAX_ERROS) {
					System.out.println("Voc� errou! Voc� ainda pode errar " + (MAX_ERROS - erros) + " vezes");
				}
			}
			
			System.out.println();
			
			if (palavra.acertouPalavra()) {
				System.out.println("Parab�ns! Voc� acertou a palavra completa: " + palavra.getPalavraOriginal());
				System.out.println("Fim do jogo");
				break;
			}
			
			if (erros == MAX_ERROS) {
				System.out.println("Voc� perdeu o jogo! A palavra correta era: " + palavra.getPalavraOriginal());
				break;
			}
		}
	}
}
