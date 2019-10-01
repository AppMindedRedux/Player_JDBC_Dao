package be.intecbrussel.JDBC_Player_demo;

public class PlayerApp {

	public static void main(String[] args) {

		
		PlayerService playerServ = new PlayerService();
		
//	playerServ.createPlayer(new Player("Romero", "Keeper"));
		
		
		playerServ.readPlayerByPosition("Keeper");
		
		
	}

}
