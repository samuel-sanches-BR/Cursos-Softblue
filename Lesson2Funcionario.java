
public class Funcionario {

	private String nome;
	private int idade;
	private double salarioHora;
	private int horasTrabalhadasMes;
	
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Funcionario(String nome) {
		this(nome, 18);
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		if (salarioHora >= 10 && salarioHora <= 200) { 
			this.salarioHora = salarioHora;
		}
	}

	public int getHorasTrabalhadasMes() {
		return horasTrabalhadasMes;
	}

	public void setHorasTrabalhadasMes(int horasTrabalhadasMes) {
		if (horasTrabalhadasMes >= 0 && horasTrabalhadasMes <= 160) {
			this.horasTrabalhadasMes = horasTrabalhadasMes;
		}
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Salário por hora: R$ " + salarioHora);
		System.out.println("Horas trabalhadas no mês: " + horasTrabalhadasMes + " horas");
	}
	
	public double calcularSalario() {
		return salarioHora * horasTrabalhadasMes;
	}
}
