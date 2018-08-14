
public class Biblioteca2 {

	public static void main(String[] args) {
		
		int p = 200;
		Livro l1 = new Livro(p);
		
		processar(l1);
		
		System.out.println(l1.getNumPaginas());
	}
	
	static void processar(Livro l) {
		l.setNumPaginas(l.getNumPaginas() + 10);
	}
}
