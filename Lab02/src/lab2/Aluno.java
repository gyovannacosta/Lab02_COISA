package lab2;

import java.util.ArrayList;

/**
 * Cada aluno tem um conjunto de disciplinas, conjunto de contas de laboratório
 * e de cantina e um objeto que represente sua saúde.
 * 
 * @author Deborah Gyovanna
 *
 */
public class Aluno {
	private String nome;
	private ArrayList<ContaLaboratorio> laboratorios;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<ContaCantina> cantinas;
	private Saude saude;

	/**
	 * O construtor Aluno tem como objetivo receber o nome do aluno cadastrado, além
	 * de inicializar os conjuntos de objetos: ContaLaboratorio, Disciplina,
	 * ContaCantina e Saude.
	 * 
	 * @param nome nome do aluno.
	 */
	public Aluno(String nome) {
		this.nome = nome;
		this.laboratorios = new ArrayList<>();
		this.disciplinas = new ArrayList<>();
		this.cantinas = new ArrayList<>();
		this.saude = new Saude();
	}

	/**
	 * O método cadastraLaboratorio(), tem como objetivo cadastrar um determinado
	 * laboratório no sistema.
	 * 
	 * @param nomeLaboratorio nome do laboratório.
	 */
	public void cadastraLaboratorio(String nomeLaboratorio) {
		this.laboratorios.add(new ContaLaboratorio(nomeLaboratorio));
	}

	/**
	 * O método cadastraLaboratorio(), tem como objetivo cadastrar um determinado
	 * laboratório no sistema e uma cota de limite de espaço disponível para uso do
	 * aluno.
	 * 
	 * @param nomeLaboratorio nome do laboratório.
	 * @param cota            espaço de limite disponível para uso.
	 */
	public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
		this.laboratorios.add(new ContaLaboratorio(nomeLaboratorio, cota));
	}

	/**
	 * O método consomeEspaco(), tem como objetivo enviar um valor que irá consumir
	 * o espaço de limite disponível da cota de um determinado laboratório
	 * previamente cadastrado.
	 * 
	 * @param nomeLaboratorio nome do laboratório.
	 * @param mbytes          quantidade de mbytes que irá ser consumido da cota.
	 */
	public void consomeEspaco(String nomeLaboratorio, int mbytes) {
		retornaLaboratorio(nomeLaboratorio).consomeEspaco(mbytes);
	}

	/**
	 * O método liberaEspaco(), tem como objetivo enviar um valor que será liberado
	 * de um espaço ocupado da conta de limite disponível de um determinado
	 * laboratório previamente cadastrado.
	 * 
	 * @param nomeLaboratorio nome do laboratório.
	 * @param mbytes          quantidade de mbytes que irá ser liberado da cota.
	 */
	public void liberaEspaco(String nomeLaboratorio, int mbytes) {
		retornaLaboratorio(nomeLaboratorio).liberaEspaco(mbytes);
	}

	/**
	 * O método atingiuCota(), tem como objetivo perguntar a um determinado
	 * laboratório previamente cadastrado se o aluno já atingiu a cota de limite
	 * disponível para uso.
	 * 
	 * @param nomeLaboratorio nome do laboratório.
	 * @return retorna um booleano false caso o limite de cota ainda não tenha sido
	 *         atingido, e retorna true caso contrário.
	 */
	public boolean atingiuCota(String nomeLaboratorio) {
		return retornaLaboratorio(nomeLaboratorio).atingiuCota();
	}

	/**
	 * O método laboratorioToString() tem como objetivo retornar o toString de um
	 * laboratório previamente cadastrado.
	 * 
	 * @param nomeLaboratorio nome do laboratório.
	 * @return toString do laboratório.
	 */
	public String laboratorioToString(String nomeLaboratorio) {
		return retornaLaboratorio(nomeLaboratorio).toString();
	}

	/**
	 * O método cadastraDisciplina(), tem como objetivo cadastrar uma determinada
	 * disciplina no sistema.
	 * 
	 * @param nomeDisciplina nome da disciplina.
	 */
	public void cadastraDisciplina(String nomeDisciplina) {
		disciplinas.add(new Disciplina(nomeDisciplina));

	}

	/**
	 * O método cadastraHoras(), tem como objetivo enviar um valor referente às
	 * horas de uma determinada disciplina previamente cadastrada.
	 * 
	 * @param nomeDisciplina nome da disciplina.
	 * @param horas          quantidade de horas à ser cadastrada.
	 */
	public void cadastraHoras(String nomeDisciplina, int horas) {
		retornaDisciplina(nomeDisciplina).cadastraHoras(horas);
	}

	/**
	 * O método cadastraNota(), tem como objetivo enviar um valor referente à nota e
	 * uma posição onde a mesma deve ser cadastrada dentro de uma determinada
	 * disciplina previamente cadastrada.
	 * 
	 * @param nomeDisciplina nome da disciplina.
	 * @param nota           posição da nota.
	 * @param valorNota      nota do aluno de uma determinada atividade na
	 *                       disciplina.
	 */
	public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
		retornaDisciplina(nomeDisciplina).cadastraNota(nota, valorNota);
	}

	/**
	 * O método aprovado(), tem como objetivo perguntar à uma determinada disciplina
	 * previamente cadastrada se o aluno foi aprovado ou reprovado.
	 * 
	 * @param nomeDisciplina nome da disciplina
	 * @return retorna uma booleano false caso o aluno tenha sido reprovado na
	 *         disciplina, e retorna true caso contrário.
	 */
	public boolean aprovado(String nomeDisciplina) {
		return retornaDisciplina(nomeDisciplina).aprovado();
	}

	/**
	 * O método disciplinaToString() tem como objetivo retornar o toString de uma
	 * disciplina previamente cadastrada.
	 * 
	 * @param nomeDisciplina nome da disciplina.
	 * @return toString da disciplina.
	 */
	public String disciplinaToString(String nomeDisciplina) {
		return retornaDisciplina(nomeDisciplina).toString();
	}

	/**
	 * O método cadastraCantina(), tem como objetivo cadastrar uma determinada
	 * cantina no sistema.
	 * 
	 * @param nomeCantina nome da cantina.
	 */
	public void cadastraCantina(String nomeCantina) {
		cantinas.add(new ContaCantina(nomeCantina));

	}

	/**
	 * O método cadastraLanche(), tem como objetivo enviar um valor referente à
	 * quantidade de itens consumidos e o valor gasto em centavos referente ao total
	 * de itens consumidos à uma determinada cantina previamente cadastrada.
	 * 
	 * @param nomeCantina   nome da cantina.
	 * @param qtdItens      quantidade de intens consumidos.
	 * @param valorCentavos valor(centavos) total do consumo.
	 */
	public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {
		retornaCantina(nomeCantina).cadastraLanche(qtdItens, valorCentavos);
	}

	/**
	 * O método pagarConta(), tem como objetivo enviar um valor em centavos para ser
	 * pago de uma compra em uma determinada cantina previamente cadastrada.
	 * 
	 * @param nomeCantina   nome da cantina.
	 * @param valorCentavos valor(centavos) à ser pago.
	 */
	public void pagarConta(String nomeCantina, int valorCentavos) {
		retornaCantina(nomeCantina).pagaConta(valorCentavos);
	}

	/**
	 * O método getFaltaPagar(), tem como objetivo perguntar a uma determinada
	 * cantina qual o total de valor em centavos que ainda falta pagar.
	 * 
	 * @param nomeCantina nome da cantina.
	 * @return retorna o total em centavos de quando ainda falta ser pago pelo
	 *         aluno.
	 */
	public int getFaltaPagar(String nomeCantina) {
		return retornaCantina(nomeCantina).getFaltaPagar();
	}

	/**
	 * O método cantinaToString() tem como objetivo retornar o toString de uma
	 * cantina previamente cadastrada.
	 * 
	 * @param nomeCantina nome da cantina.
	 * @return toString da cantina.
	 */
	public String cantinaToString(String nomeCantina) {
		return retornaCantina(nomeCantina).toString();
	}

	/**
	 * O método defineSaudeMental(), tem como objetivo enviar um valor para definir
	 * o estado de saúde mental do aluno.
	 * 
	 * @param valor string de valor de saúde mental.
	 */
	public void defineSaudeMental(String valor) {
		saude.defineSaudeMental(valor);
	}

	/**
	 * O método defineSaudeFisical(), tem como objetivo enviar um valor para definir
	 * o estado de saúde física do aluno.
	 * 
	 * @param valor string de valor de saúde física.
	 */
	public void defineSaudeFisica(String valor) {
		saude.defineSaudeFisica(valor);
	}

	/**
	 * O método getStatusGeral(), tem como objetivo perguntar o estado geral de
	 * saúde do aluno.
	 * 
	 * @return o estatus geral de saúde do aluno.
	 */
	public String getStatusGeral() {
		return saude.getStatusGeral();
	}

	/**
	 * O método getNome(), tem como objetivo retornar o nome do aluno caso seja
	 * necessário para uso em uma classe main.
	 * 
	 * @return nome do aluno.
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * O método privado retornaLaboratorio(), tem como objetivo achar um laboratório
	 * cadastrado dentro de um array de objetos de laboratórios.
	 * 
	 * @param nomeLaboratorio nome do laboratório.
	 * @return retorna o objeto referente ao nome do laboratório.
	 */
	private ContaLaboratorio retornaLaboratorio(String nomeLaboratorio) {
		ContaLaboratorio lab = null;
		for (ContaLaboratorio contalab : laboratorios) {
			if (contalab.getLaboratorio().equals(nomeLaboratorio)) {
				lab = contalab;
			}
		}
		return lab;
	}

	/**
	 * O método privado retornaDisciplina(), tem como objetivo achar uma disciplina
	 * cadastrada dentro de um array de objetos de disciplinas.
	 * 
	 * @param nomeDisciplina nome da disciplina.
	 * @return retorna o objeto referente ao nome da disciplina.
	 */
	private Disciplina retornaDisciplina(String nomeDisciplina) {
		Disciplina cadeira = null;
		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getDisciplina().equals(nomeDisciplina)) {
				cadeira = disciplina;
			}
		}
		return cadeira;
	}

	/**
	 * O método privado retornaCantina(), tem como objetivo achar uma cantina
	 * cadastrada dentro de um array de objetos de cantinas.
	 * 
	 * @param nomeCantina nome da cantina.
	 * @return retorna o objeto referente ao noma da cantina.
	 */
	private ContaCantina retornaCantina(String nomeCantina) {
		ContaCantina novaCantina = null;
		for (ContaCantina cantina : cantinas) {
			if (cantina.getCantina().equals(nomeCantina)) {
				novaCantina = cantina;
			}
		}
		return novaCantina;
	}

}
