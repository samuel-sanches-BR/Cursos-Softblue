
public class Blinky implements Ghost {

	@Override
	public void morrer() {
	}

	@Override
	public void mover() {
		System.out.println("Blinky moveu");
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhou Blinky");
	}
}
