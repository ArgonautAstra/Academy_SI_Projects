package Esercizio_6;

public class Main {

	public static void main(String[] args) {

		OldCassettePlayer oldPlayer = new OldCassettePlayer(1);
		CassettePlayer player1 = new NewCassettePlayer("Mass Destruction");
		CassettePlayer player2 = new OldCassettePlayerAdapter(oldPlayer);

		System.out.println(oldPlayer.start());
		
		System.out.println(player1.start());
		System.out.println(player2.start());

	}

}
