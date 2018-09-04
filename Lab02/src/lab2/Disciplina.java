package lab2;

import java.util.Arrays;

public class Disciplina {
	public String nome;
	public double[] notas;
	public int horas;
	public double media;
	

	public Disciplina(String nomeDisciplina) {
		this.nome = nomeDisciplina;
		this.notas = new double[4];
		for (double nota : notas) {
			nota = 0.0;
		}
		this.horas = 0;
		this.media = 0.0;
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
			soma += notas[i];
		}
		this.media = soma/4;
		return this.media;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.horas + " " + String.format("%.1f", calculoMedia()) + " " + Arrays.toString(this.notas);
	}

}
