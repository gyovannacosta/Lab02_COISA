package lab2;

public class Saude {
	private String saudeMental;
	private String saudeFisica;
	
	public Saude() {
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
	}

	public String getStatusGeral() {
		if(this.saudeMental.equals("boa")) {
			if(this.saudeFisica.equals("boa")) {
				return "boa";
			}
			return "ok";
		}else {
			if(this.saudeFisica.equals("boa")) {
				return "ok";
			}
			return "fraca";
		}
	}

	public void defineSaudeMental(String estado) {
		this.saudeMental = estado;
		
	}

	public void defineSaudeFisica(String estado) {
		this.saudeFisica = estado;
		
	}

}
