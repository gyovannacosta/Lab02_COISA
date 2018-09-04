package lab2;

public class ContaLaboratorio {
	private String nome;
	private int cota;
	private int espacoOcupado;

	public ContaLaboratorio(String nomeLaboratorio) {
		this.nome = nomeLaboratorio;
		this.cota = 2000;
		this.espacoOcupado = 0;
	}
	
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nome = nomeLaboratorio;
		this.cota = cota;
		this.espacoOcupado = 0;
	
	}

	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;
		
	}

	public boolean atingiuCota() {
		if(this.espacoOcupado >= this.cota) {
			return true;
		}
		return false;
	}

	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;
		
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.espacoOcupado + "/" + this.cota;
	}

}
