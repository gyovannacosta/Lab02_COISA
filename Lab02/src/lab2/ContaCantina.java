package lab2;

/**
 * ContaCantina tem como objetivo controlar os gastos em uma cantina, os lanches
 * realizados são adicionados à conta da cantina previamente cadastrada. Para
 * cada lanche são indicados o número de itens que foram consumidos naquele
 * momento e o valor gasto (em centavos). Ao pagar a conta o usuário indica o
 * valor que será pago em centavos. Este valor pode ser menor, mas nunca
 * superior ao valor devido. A qualquer momento, o aluno pode consultar o valor
 * que ainda deve na cantina.
 * 
 * @author Deborah Gyovanna
 *
 */
public class ContaCantina {
	private String nome;
	private int qtdItens;
	private int valor;
	private int valorPago;
	private String[] descricao;
	private int posicaoDescr;

	/**
	 * Construtor da classe cantina, tem como objetivo receber o nome da Cantina,
	 * definir valores de itens e valor(centavos) inicial e inicializar um array de
	 * descrição de itens comprados.
	 * 
	 * @param nomeCantina nome da Cantina
	 */
	public ContaCantina(String nomeCantina) {
		this.nome = nomeCantina;
		this.qtdItens = 0;
		this.valor = 0;
		this.valorPago = 0;
		this.descricao = new String[5];
		for (int i = 0; i < descricao.length; i++) {
			descricao[i] = "";
		}
		this.posicaoDescr = 0;

	}

	/**
	 * O método cadastraLanche(), tem como objetivo registrar o número de itens
	 * comprados e o seu custo(centavos).
	 * 
	 * @param qtd      quantidade de itens comprados.
	 * @param centavos (centavos) da compra para ser cadastrado("pendurado").
	 */
	public void cadastraLanche(int qtd, int centavos) {
		this.qtdItens += qtd;
		this.valor += centavos;

	}

	/**
	 * O método cadastraLanche(), tem como objetivo registrar o número de itens
	 * comprados, o seu custo(centavos) e uma breve descrição do lache comprado.
	 * 
	 * @param qtd      quantidade de itens comprados.
	 * @param centavos valor(centavos) da compra para ser cadastrado("pendurado").
	 * @param detalhes breve descrição do lanche comprado.
	 */
	public void cadastraLanche(int qtd, int centavos, String detalhes) {
		this.qtdItens = qtd;
		this.valor = centavos;
		if (this.posicaoDescr < 5) {
			this.descricao[posicaoDescr] = detalhes;
			this.posicaoDescr++;
		} else {
			for (int i = 0; i < this.descricao.length - 1; i++) {
				this.descricao[i] = this.descricao[i + 1];
			}
			this.descricao[this.descricao.length - 1] = detalhes;
		}
	}

	/**
	 * o método pagaConta(), tem como objetivo acrescentar valor(centavos)
	 * 
	 * @param valor(centavos) pagos.
	 */
	public void pagaConta(int centavos) {
		this.valorPago += centavos;
	}

	/**
	 * O método getFaltaPagar(), tem como objetivo calcular e retornar o
	 * valor(centavos) que ainda falta ser pago pelo aluno.
	 * 
	 * @return valor(centavos) que falta pagar.
	 */
	public int getFaltaPagar() {
		return this.valor - this.valorPago;
	}

	/**
	 * O método listarDetalhes(), lista as últimas 5 descrições cadastradas na
	 * cantina.
	 * 
	 * @return deve retornar uma string com as últimas 5 descrições, um em cada
	 *         linha.
	 */
	public String listarDetalhes() {
		String listar = "";
		for (int i = 0; i < descricao.length; i++) {
			listar += descricao[i] + System.lineSeparator();
		}
		return listar.trim();
	}
	
	public String getCantina() {
		return this.nome;
	}

	/**
	 * O método toString(), comunica: o nome da cantina, a quantidade de itens e o
	 * valor dos lanches cadastrados até o momento.
	 */
	@Override
	public String toString() {
		return this.nome + " " + this.qtdItens + " " + this.valor;
	}

}
