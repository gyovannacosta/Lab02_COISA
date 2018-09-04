package lab2;

public class ContaCantina {
	private String nome;
	private int qtdItens;
	private int valor;
	private int valorPago;

	public ContaCantina(String nomeCantina) {
		this.nome = nomeCantina;
		this.qtdItens = 0;
		this.valor = 0;
		this.valorPago = 0;
	}

	public void cadastraLanche(int qtd, int centavos) {
		this.qtdItens += qtd;
		this.valor += centavos;
		
	}

	public void pagaConta(int centavos) {
		this.valorPago += centavos;
	}

	public int getFaltaPagar() {
		return this.valor - this.valorPago;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.qtdItens + " " + this.valor;
	}

}
