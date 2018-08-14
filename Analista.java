
public class Analista extends Funcionario {

	private String nomeSetor;
	
	public Analista(String nome, int idade) {
		super(nome, idade);
	}
	
	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}
	
	public String getNomeSetor() {
		return nomeSetor;
	}
	
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Nome do Setor: " + nomeSetor);
	}
}
