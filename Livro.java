
public class Livro {

	private int numPaginas;
	
	public Livro() {
		System.out.println("Criou o livro");
	}
	
	public Livro(int numPaginas) {
		this.numPaginas = numPaginas;
		
		numPaginas = 100;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
}
