
public class ExemploArray {

	public static void main(String[] args) {
		
		double[] notas = new double[6];
		notas[0] = 7.5;
		notas[1] = 9;
		notas[2] = 8;
		notas[3] = 6.5;
		notas[4] = 10;
		notas[5] = 2;
		
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			double nota = notas[i];
			soma += nota;
			System.out.println(nota);
		}
		
		double media = soma / notas.length;
		System.out.println("Média = " + media);
	}
}
