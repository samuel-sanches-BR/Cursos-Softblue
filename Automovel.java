
public class Automovel extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Automóvel ligou");
	}
	
	@Override
	public String toString() {
		return "Automóvel tem cor " + cor;
	}
}
