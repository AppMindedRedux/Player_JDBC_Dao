package be.intecbrussel.JDBC_Player_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	private Connection connection;
	private static ConnectionProvider instance = new ConnectionProvider();

	// getter for the created ConnectionProvider instance
	public static ConnectionProvider getInstance() {
		return instance;
	}

	public Connection getConnection() throws SQLException {

		if (connection == null) {

			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/info_tai?serverTimezone=UTC", "root","");
		}

		return connection;
	}

}
