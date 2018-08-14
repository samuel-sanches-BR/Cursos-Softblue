import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	public static final int FUNCIONARIO_GERENTE = 1;
	public static final int FUNCIONARIO_ANALISTA = 2;
	
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public static Funcionario criarFuncionario(int tipo, String nome, int idade) {
		Funcionario funcionario = null;
		
		if (tipo == FUNCIONARIO_GERENTE) {
			funcionario = new Gerente(nome, idade);
		
		} else if (tipo == FUNCIONARIO_ANALISTA) {
			funcionario = new Analista(nome, idade);
		}
		
		return funcionario;
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public Funcionario procurarFuncionario(String nome) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getNome().equals(nome)) {
				return funcionario;
			}
		}
		
		return null;
	}
}
