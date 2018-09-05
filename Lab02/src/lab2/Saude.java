package lab2;

public class Saude {
	private String saudeMental;
	private String saudeFisica;
	private String emoji;
	
	public Saude() {
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
		this.emoji = "";
	}

	public String getStatusGeral() {
		if(this.saudeMental.equals("boa")) {
			if(this.saudeFisica.equals("boa")) {
				return "boa" + " ".trim() + this.emoji;
			}
			return "ok" + " ".trim() + this.emoji;
		}else {
			if(this.saudeFisica.equals("boa")) {
				return "ok" + " ".trim() + this.emoji;
			}
			return "fraca" + " ".trim() + this.emoji;
		}
	}

	public void defineSaudeMental(String estado) {
		this.saudeMental = estado;
		this.emoji = "";
		
	}

	public void defineSaudeFisica(String estado) {
		this.saudeFisica = estado;
		this.emoji = "";
		
	}
	
	public void definirEmoji(String Emoji) {
		this.emoji = Emoji;
	}

}
