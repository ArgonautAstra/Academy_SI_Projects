package Esercizio_6;

public class OldCassettePlayerAdapter implements CassettePlayer{

	private OldCassettePlayer oldCassettePlayer;

	public OldCassettePlayerAdapter(OldCassettePlayer oldCassettePlayer) {
		this.oldCassettePlayer = oldCassettePlayer;
	}

	public String start() {
		return "Old Cassetta converted: " + String.valueOf(oldCassettePlayer.start());
	}
	
	
}
