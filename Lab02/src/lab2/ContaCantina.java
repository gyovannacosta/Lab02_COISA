package lab2;

public class ContaCantina {
	private String nome;
	private int qtdItens;
	private int valor;
	private int valorPago;
	private String[] descricao;
	private int posicaoDescr;

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

	public void cadastraLanche(int qtd, int centavos) {
		this.qtdItens += qtd;
		this.valor += centavos;
		
	}
	
	public void cadastraLanche(int qtd, int centavos, String detalhes) {
		this.qtdItens = qtd;
		this.valor = centavos;
		if(this.posicaoDescr < 5) {
			this.descricao[posicaoDescr] = detalhes;
			this.posicaoDescr ++;
		}else {
			for (int i = 0; i < this.descricao.length -1; i++) {
				this.descricao[i] = this.descricao[i+1];
			} this.descricao[this.descricao.length -1] = detalhes;
		}
	}

	public void pagaConta(int centavos) {
		this.valorPago += centavos;
	}

	public int getFaltaPagar() {
		return this.valor - this.valorPago;
	}
	
	public String listarDetalhes() {
		String listar = "";
		for (int i = 0; i < descricao.length; i++) {
			listar += descricao[i] + System.lineSeparator();
		}
		return listar.trim();
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.qtdItens + " " + this.valor;
	}

}
