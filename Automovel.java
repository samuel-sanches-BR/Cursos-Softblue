
public class Automovel extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Autom�vel ligou");
	}
	
	@Override
	public String toString() {
		return "Autom�vel tem cor " + cor;
	}
}
