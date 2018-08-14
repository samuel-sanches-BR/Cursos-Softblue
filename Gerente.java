
public class Gerente extends Funcionario {

	private double bonus;
	
	public Gerente(String nome, int idade) {
		super(nome, idade);
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double calcularSalario() {
		double salario = super.calcularSalario();
		return salario + bonus;
	}
	
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Bônus: R$ " + bonus);
	}
}
