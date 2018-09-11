package lab2;

import java.util.Arrays;

/**
 * Disciplina tem como objetivo apurar notas de um aluno, cálcular sua média e
 * assim determinar se o mesmo está aprovado ou não por média. Para cada
 * disciplina existe uma determinada quantidade de notas e pesos refentes à
 * essas notas.
 * 
 * @author Deborah Gyovanna
 *
 */
public class Disciplina {
	private String nome;
	private double[] notas;
	private int horas;
	private double media;
	private int[] pesos;

	/**
	 * O construtor de Disciplina tem como objetivo receber o nome da disciplina,
	 * definir o número de notas padrão para 4, e iniciar ambas as notas com valor
	 * igual à 0.0, inicializar horas e média iguais à 0, além de atribuir o peso
	 * padrão das notas igual à 1.
	 * 
	 * @param nomeDisciplina nome da disciplina cadastrada.
	 */
	public Disciplina(String nomeDisciplina) {
		this(nomeDisciplina, 4);
	}

	/**
	 * O construtor de Disciplina tem como objetivo receber o nome da disciplina e o
	 * número de notas que serão cadastradas, e iniciar ambas as notas com valor
	 * igual à 0.0, inicializar horas e média iguais à 0, além de atribuir o peso
	 * padrão das notas igual à 1.
	 * 
	 * @param nomeDisciplina  nome da disciplina cadastrada.
	 * @param notasDisciplina quantidade de notas da disciplina.
	 */
	public Disciplina(String nomeDisciplina, int notasDisciplina) {
		this.nome = nomeDisciplina;
		this.notas = new double[notasDisciplina];
		for (double nota : notas) {
			nota = 0.0;
		}
		this.horas = 0;
		this.media = 0.0;
		this.pesos = new int[notasDisciplina];
		for (int i = 0; i < pesos.length; i++) {
			pesos[i] = 1;
		}
	}

	/**
	 * O construtor de Disciplina tem como objetivo receber o nome da disciplina, o
	 * número de notas que serão cadastradas e um array de pesos referente a cada
	 * nota cadastrada na disciplina, iniciar ambas as notas com valor igual à 0.0,
	 * além de inicializar horas e média iguais à 0.
	 * 
	 * @param nomeDisciplina  nome da disciplina cadastrada.
	 * @param notasDisciplina quantidade de notas da disciplina.
	 * @param peso            array de pesos referentes às notas cadastradas.
	 */
	public Disciplina(String nomeDisciplina, int notasDisciplina, int[] peso) {
		this.nome = nomeDisciplina;
		this.notas = new double[notasDisciplina];
		for (double nota : notas) {
			nota = 0.0;
		}
		this.horas = 0;
		this.media = 0.0;
		this.pesos = new int[notasDisciplina];
		for (int i = 0; i < pesos.length; i++) {
			pesos[i] = peso[i];
		}
	}

	/**
	 * O método cadastraHoras(), tem como objetivo adicionar horas à disciplina
	 * cadastrada.
	 * 
	 * @param horaCadastrada quantidade de horas.
	 */
	public void cadastraHoras(int horaCadastrada) {
		this.horas += horaCadastrada;
	}

	/**
	 * O método cadastraNota(), tem como objetivo receber uma posição e cadastrar
	 * uma nota no local dessa posição -1 dentro do array de notas.
	 * 
	 * @param posicao posição da nota.
	 * @param nota    nota que será cadastra.
	 */
	public void cadastraNota(int posicao, double nota) {
		for (int i = 0; i < notas.length; i++) {
			if (posicao - 1 == i) {
				notas[i] = nota;
			}
		}

	}

	/**
	 * O método aprovado(), tem como objetivo receber o cálculo da média do aluno
	 * nessa disciplina e definir se o mesmo foi aprovado ou não.
	 * 
	 * @return retorna true caso o cálculo de média seja maior ou igual à 7 e
	 *         retorna false caso contrário.
	 */
	public boolean aprovado() {
		if (calculoMedia() >= 7) {
			return true;
		}
		return false;
	}

	/**
	 * O método getDisciplina(), tem como objetivo informar o nome da disciplina
	 * cadastrada.
	 * 
	 * @return nome da disciplina.
	 */
	public String getDisciplina() {
		return this.nome;
	}

	/**
	 * O método calculoMedia() é um método privado da classe Disciplina, que tem
	 * como objetivo realizar uma média ponderada com os valores de nota, pesos
	 * referentes à ambas notas e a quantidade de notas cadastradas.
	 * 
	 * @return retorna o resultado do cálculo da média ponderada das notas.
	 */
	private double calculoMedia() {
		double soma = 0.0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i] * this.pesos[i];
		}
		this.media = soma / this.notas.length;
		return this.media;
	}

	/**
	 * O método toString() comunica: o nome da disciplina, as horas cadastradas, o
	 * cálculo da média do aluno, e um array contendo todas as notas do aluno.
	 */
	@Override
	public String toString() {
		return this.nome + " " + this.horas + " " + String.format("%.1f", calculoMedia()) + " "
				+ Arrays.toString(this.notas);
	}

}
