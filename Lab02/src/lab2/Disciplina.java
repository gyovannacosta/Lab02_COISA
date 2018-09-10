package lab2;

import java.util.Arrays;

public class Disciplina {
	private String nome;
	private double[] notas;
	private int horas;
	private double media;
	private int[] pesos;
	

	public Disciplina(String nomeDisciplina) {
		this(nomeDisciplina, 4);
	}
	
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

	public void cadastraHoras(int horaCadastrada) {
		this.horas += horaCadastrada;		
	}

	public void cadastraNota(int posicao, double nota) {
		for (int i = 0; i < notas.length; i++) {
			if(posicao-1 == i) {
				notas[i] = nota;
			}
		}
		
	}

	public boolean aprovado() {
		if(calculoMedia() >= 7) {
			return true;
		}
		return false;
	}
	
	private double calculoMedia() {
		double soma = 0.0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i]*this.pesos[i];
		}
		this.media = soma/this.notas.length;
		return this.media;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.horas + " " + String.format("%.1f", calculoMedia()) + " " + Arrays.toString(this.notas);
	}

}
