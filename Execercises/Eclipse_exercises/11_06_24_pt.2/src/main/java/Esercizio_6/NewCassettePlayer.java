package Esercizio_6;

public class NewCassettePlayer implements CassettePlayer{

	private String audio;
	
	public NewCassettePlayer(String audio) {
		this.audio = audio;
	}
	
	public String start() {
		return "New Cassetta: " +audio;
	}

}
