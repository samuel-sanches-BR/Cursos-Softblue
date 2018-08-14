import java.util.List;

public class Dicionario {
	
	private List<String> palavras;

	public Dicionario() {
		carregarPalavras();
	}

	private void carregarPalavras() {
		palavras = List.of(
			"CLASSE",
			"OBJETO",
			"ATRIBUTO",
			"STRING",
			"HERANCA",
			"INTERFACE",
			"ENCAPSULAMENTO",
			"POLIMORFISMO",
			"SOBRECARGA",
			"SOBRESCRITA"
		);
	}

	public Palavra proximaPalavra() {
		int pos = RandomUtils.gerarNumeroRandomico(0, palavras.size());
		String palavraSorteada = palavras.get(pos);
		Palavra palavra = new Palavra(palavraSorteada);
		return palavra;
	}
}