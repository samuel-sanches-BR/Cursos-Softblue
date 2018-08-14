
public class Biblioteca {

	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		//l1.numPaginas = 50;
		System.out.println(l1.getNumPaginas());
		
		Livro l2 = new Livro(350);
		System.out.println(l2.getNumPaginas());
	}
}
