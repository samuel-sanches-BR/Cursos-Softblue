import java.util.ArrayList;
import java.util.List;

public class Pacman {

	public static void main(String[] args) {
		List<Desenhavel> desenhaveis = new ArrayList();
		
		Maze maze = new Maze();
		desenhaveis.add(maze);
		
		List<Ghost> ghosts = criarFantasmas();
		
		for (Ghost g : ghosts) {
			desenhaveis.add(g);
			g.mover();
		}
		
		for (Desenhavel d : desenhaveis) {
			d.desenhar();
		}
	}
	
	private static List<Ghost> criarFantasmas() {
		List<Ghost> ghosts = new ArrayList<>();
		
		ghosts.add(new Inky());
		ghosts.add(new Blinky());
		ghosts.add(new Pinky());
		ghosts.add(new Clyde());
		
		return ghosts;
	}
}
