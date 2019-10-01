package be.intecbrussel.JDBC_Player_demo;

import java.sql.SQLException;
import java.util.List;

public interface PlayerDAO {
	
	//CREATE
	void createPlayer(Player player) throws SQLException;
	//READ
	List<Player> readPlayerByPosition(String position) throws SQLException;
	//UPDATE
	void updatePlayer(Player player) throws SQLException;
	//DELETE
	void deleteEmployee(int id) throws SQLException;
	

}
