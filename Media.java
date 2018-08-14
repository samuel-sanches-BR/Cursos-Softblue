
public class Media {

	public static void main(String[] args) {
		
		double n1 = 8.5;
		double n2 = 9.5;
		double n3 = 8;
		
		//double media = (n1 + n2 + n3) / 3;
		//System.out.println(media);
		
		double soma = 0;
		
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				soma += n1;
			} else if (i == 1) {
				soma += n2;
			} else {
				soma += n3;
			}
		}
		
		double media = soma / 3;
		System.out.println(media);
	}
}
