package lab2;

/**
 * ContaLaboratorio tem como objetivo ser responsável por manter o registro da
 * quantidade de espaço utilizado, pelo aluno, em determinado laboratório. Para
 * cada laboratório existe uma determinada quantia de limite de armazenamento
 * disponível, quando atingido esse limite o método de verificação de limite
 * disponível deve indicar que o usuário já atingiu o limite de cota.
 * 
 * @author Deborah Gyovanna
 *
 */
public class ContaLaboratorio {
	private String nome;
	private int cota;
	private int espacoOcupado;

	/**
	 * O construtor de ContaLaboratorio tem como objetivo receber o nome do
	 * laboratório, definir espaço limite(cota) disponível padrão de 2000mb e espaço
	 * ocupado inicial igual a 0.
	 * 
	 * @param nomeLaboratorio nome do laboratório cadastrado.
	 */
	public ContaLaboratorio(String nomeLaboratorio) {
		this(nomeLaboratorio, 2000);
		this.espacoOcupado = 0;
	}

	/**
	 * O construtor de ContaLaboratorio tem como objetivo receber o nome do
	 * laboratório, receber o espaço limite(cota) disponível e espaço ocupado
	 * inicial igual a 0.
	 * 
	 * @param nomeLaboratorio nome do laboratório cadastrado.
	 * @param cota            espaço de limite disponível para uso.
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nome = nomeLaboratorio;
		this.cota = cota;
		this.espacoOcupado = 0;

	}

	/**
	 * O método consomeEspaco(), tem como objetivo receber um valor que irá consumir
	 * o espaço de limite(cota) e será somado ao quantidade espaço ocupado pelo
	 * usuário.
	 * 
	 * @param mbytes quantidade de mbytes que irá ser consumido da cota.
	 */
	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;

	}

	/**
	 * O método atingiuCota(), tem como objetivo verificar se o limite(cota) de
	 * espaço disponível foi atingido.
	 * 
	 * @return retorna true caso o espaço ocupado seja igual ou superior a cota, e
	 *         retorna false caso seja menor que a cota.
	 */
	public boolean atingiuCota() {
		if (this.espacoOcupado >= this.cota) {
			return true;
		}
		return false;
	}

	/**
	 * O método liberaEspaco(), tem como objetivo liberar espaço ocupado pelo
	 * usuário.
	 * 
	 * @param mbytes quantidade de mbytes que irá ser liberado do consumo da cota.
	 */
	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;

	}

	/**
	 * O método getLaboratorio(), tem como objetivo informar o nome do laboratório
	 * cadastrado.
	 * 
	 * @return nome do laboratório.
	 */
	public String getLaboratorio() {
		return this.nome;
	}

	/**
	 * O método toString() comunica: o nome do laboratório, o espaço ocupado pelo
	 * usuário, e o limite de espaço disponível.
	 */
	@Override
	public String toString() {
		return this.nome + " " + this.espacoOcupado + "/" + this.cota;
	}

}
