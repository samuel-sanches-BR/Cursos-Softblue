
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		double p = 5000;
		int n = 12;
		double i = 0.01;
		
		double pot = 1;
		for(int x = 0; x < n; x++) {
			pot *= 1 + i;
		}
		
		double m = p * pot;
		System.out.printf("%.2f",m);
	}
}
