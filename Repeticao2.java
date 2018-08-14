
public class Repeticao2 {

	public static void main(String[] args) {
		
		for (int x = 0; x < 50; x += 2) {
			//System.out.println(x);
			
			//break;
		}
		
		for (int x = 0; x < 20; x++) {
			if (x % 2 != 0) {
				continue;
			}
			
			System.out.println(x);
		}
	}
}
