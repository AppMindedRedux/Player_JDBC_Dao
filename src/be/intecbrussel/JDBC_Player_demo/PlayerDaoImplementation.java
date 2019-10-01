package be.intecbrussel.JDBC_Player_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class PlayerDaoImplementation implements PlayerDAO {



	public Connection createConnection() throws SQLException {
		return ConnectionProvider.getInstance().getConnection();
	}

	@Override
	public void createPlayer(Player player) throws SQLException {

		try(PreparedStatement preparedStmt =
				createConnection().prepareStatement("INSERT INTO players(name, position)" + "VALUES(?,?)")) {
			
			preparedStmt.setString(1, player.getName());
			preparedStmt.setString(2, player.getPosition());
			
			preparedStmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(player.getName() + " added to players table!");
	}

	@Override
	public List<Player> readPlayerByPosition(String position) throws SQLException {
			
		PreparedStatement prepStmt = 
				createConnection().prepareStatement("SELECT * FROM players WHERE POSITION=?");
		
		prepStmt.setString(1, position);
		
		ResultSet resultSet = prepStmt.executeQuery();
		
		List<Player> playerList = new ArrayList<>();
		
		
		while(resultSet.next()) {
			
			Player player = new Player();
			
			player.setName(resultSet.getString("name"));
			player.setPosition(resultSet.getString("position"));
			playerList.add(player);
		}
		System.out.println(playerList);
		return playerList;
	}

	@Override
	public void updatePlayer(Player player) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub

	}



}
