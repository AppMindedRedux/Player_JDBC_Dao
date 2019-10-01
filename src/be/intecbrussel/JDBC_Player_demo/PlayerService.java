package be.intecbrussel.JDBC_Player_demo;

import java.sql.SQLException;

public class PlayerService {
	
	private PlayerDaoImplementation playerDAO = new PlayerDaoImplementation();
	
	public void createPlayer(Player player) {
		
		try {
			playerDAO.createPlayer(player);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void readPlayerByPosition(String position) {
		
		try {
			playerDAO.readPlayerByPosition(position);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
