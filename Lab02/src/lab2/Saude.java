package lab2;

/**
 * Saude tem como objetivo determinar o estado geral de saúde do aluno, baseado
 * no estado de sua saúde física e mental.
 * 
 * @author Deborah Gyovanna
 *
 */
public class Saude {
	private String saudeMental;
	private String saudeFisica;
	private String emoji;

	/**
	 * O construtor de Saude tem como objetivo definir um estado de saúde físico e
	 * mental padrão para cada aluno, além de inicializar a variável emoji.
	 */
	public Saude() {
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
		this.emoji = "";
	}

	/**
	 * o método getStatusGeral(), tem como objetivo determinar o estado de saúde
	 * geral do aluno a partir do seu estado físico e mental.
	 * 
	 * @return retorna "fraca" caso ambas as saúdes estejam fracas. Retorna "boa"
	 *         caso ambas as saúdes estejam boas. Retorna "ok" caso uma delas esteja
	 *         fraca, porém a outra esteja boa. Caso o aluno tenha informado um
	 *         emoji/descrição e não tenha alterado nenhum dos tipos de saúde
	 *         posteriormente, ele vai ser retornado junto ao status de saúde em
	 *         ambos os casos.
	 */
	public String getStatusGeral() {
		if (this.saudeMental.equals("boa")) {
			if (this.saudeFisica.equals("boa")) {
				return "boa" + " ".trim() + this.emoji;
			}
			return "ok" + " ".trim() + this.emoji;
		} else {
			if (this.saudeFisica.equals("boa")) {
				return "ok" + " ".trim() + this.emoji;
			}
			return "fraca" + " ".trim() + this.emoji;
		}
	}

	/**
	 * O método defineSaudeMental(), tem como objetivo receber uma string de valor
	 * para definir o estado de saúde mental do aluno.
	 * 
	 * @param estado estado mental do aluno.
	 */
	public void defineSaudeMental(String estado) {
		this.saudeMental = estado;
		this.emoji = "";

	}

	/**
	 * O método defineSaudeFisica(), tem como objetivo receber uma string de valor
	 * para definir o estado de saúde física do aluno.
	 * 
	 * @param estado estado físico do aluno.
	 */
	public void defineSaudeFisica(String estado) {
		this.saudeFisica = estado;
		this.emoji = "";

	}

	/**
	 * O método definirEmoji(), tem como objetivo receber uma string de valor para
	 * definir uma descrição/emoji.
	 * 
	 * @param Emoji emoji/descrição informada pelo aluno.
	 */
	public void definirEmoji(String Emoji) {
		this.emoji = Emoji;
	}

}
