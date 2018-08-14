
public class Strings2 {

	public static void main(String[] args) {
		
		String s1 = "ABC";
		//String s2 = "ABC";
		String s2 = new String("ABC");
		
		if (s1.equals(s2)) {
			System.out.println("IGUAL");
		} else {
			System.out.println("DIFERENTE");
		}
	}
}
