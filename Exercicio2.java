
public class Exercicio2 {
	
	public static void main(String[] args) {
		Gerente f1 = new Gerente("Jos�", 35);
		f1.setSalarioHora(35);
		f1.setHorasTrabalhadasMes(160);
		f1.setBonus(1000);
		
		f1.mostrarDados();
		double salariof1 = f1.calcularSalario();
		System.out.println("Sal�rio: R$ " + salariof1);
		
		System.out.println();
		
		Analista f2 = new Analista("Pedro", 28);
		f2.setSalarioHora(20);
		f2.setHorasTrabalhadasMes(160);
		f2.setNomeSetor("Compras");
		
		f2.mostrarDados();
		double salariof2 = f2.calcularSalario();
		System.out.println("Sal�rio: R$ " + salariof2);
	}
}
