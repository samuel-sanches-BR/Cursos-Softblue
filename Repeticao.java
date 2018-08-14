
public class Repeticao {

	public static void main(String[] args) {
		
		int contador = 12;
		
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		do {
			System.out.println(contador);
			contador++;
		} while (contador <= 10);
		
		System.out.println("FIM");
	}
}
