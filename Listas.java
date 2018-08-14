import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Java");
		lista.add("C");
		lista.add("C++");
		
		for (String s : lista) {
			System.out.println(s.toUpperCase());
		}
	}
}
