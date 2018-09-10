package lab2;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private ArrayList<ContaLaboratorio> laboratorios;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<ContaCantina> cantinas;
	private Saude saude;

	public Aluno(String nome) {
		this.nome = nome;
		this.laboratorios = new ArrayList<>();
		this.disciplinas = new ArrayList<>();
		this.cantinas = new ArrayList<>();
		this.saude = new Saude();
	}

	public void cadastraLaboratorio(String nomeLaboratorio) {
		this.laboratorios.add(new ContaLaboratorio(nomeLaboratorio));
	}

	public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
		this.laboratorios.add(new ContaLaboratorio(nomeLaboratorio, cota));
	}

	public void consomeEspaco(String nomeLaboratorio, int mbytes) {
		retornaLaboratorio(nomeLaboratorio).consomeEspaco(mbytes);
	}

	public void liberaEspaco(String nomeLaboratorio, int mbytes) {
		retornaLaboratorio(nomeLaboratorio).liberaEspaco(mbytes);
	}

	public boolean atingiuCota(String nomeLaboratorio) {
		return retornaLaboratorio(nomeLaboratorio).atingiuCota();
	}

	public String laboratorioToString(String nomeLaboratorio) {
		return retornaLaboratorio(nomeLaboratorio).toString();
	}

	public void cadastraDisciplina(String nomeDisciplina) {
		disciplinas.add(new Disciplina(nomeDisciplina));

	}

	public void cadastraHoras(String nomeDisciplina, int horas) {
		retornaDisciplina(nomeDisciplina).cadastraHoras(horas);
	}

	public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
		retornaDisciplina(nomeDisciplina).cadastraNota(nota, valorNota);
	}

	public boolean aprovado(String nomeDisciplina) {
		return retornaDisciplina(nomeDisciplina).aprovado();
	}

	public String disciplinaToString(String nomeDisciplina) {
		return retornaDisciplina(nomeDisciplina).toString();
	}

	public void cadastraCantina(String nomeCantina) {
		cantinas.add(new ContaCantina(nomeCantina));

	}

	public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {
		retornaCantina(nomeCantina).cadastraLanche(qtdItens, valorCentavos);
	}

	public void pagarConta(String nomeCantina, int valorCentavos) {
		retornaCantina(nomeCantina).pagaConta(valorCentavos);
	}

	public int getFaltaPagar(String nomeCantina) {
		return retornaCantina(nomeCantina).getFaltaPagar();
	}

	public String cantinaToString(String nomeCantina) {
		return retornaCantina(nomeCantina).toString();
	}

	public void defineSaudeMental(String valor) {
		saude.defineSaudeMental(valor);
	}

	public void defineSaudeFisica(String valor) {
		saude.defineSaudeFisica(valor);
	}

	public String getStatusGeral() {
		return saude.getStatusGeral();
	}
	
	private ContaLaboratorio retornaLaboratorio(String nomeLaboratorio) {
		ContaLaboratorio lab = null;
		for (ContaLaboratorio contalab : laboratorios) {
			if (contalab.getNome().equals(nomeLaboratorio)) {
				 lab = contalab;
			}
		} return lab;
	} 
	
	private Disciplina retornaDisciplina(String nomeDisciplina) {
		Disciplina cadeira = null;
		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getDisciplina().equals(nomeDisciplina)) {
				cadeira = disciplina;
			}
		} return cadeira;
	} 
	
	private ContaCantina retornaCantina(String nomeCantina) {
		ContaCantina novaCantina = null;
		for (ContaCantina cantina : cantinas) {
			if (cantina.getCantina().equals(nomeCantina)) {
				novaCantina = cantina;
			}
		} return novaCantina;
	}

}
