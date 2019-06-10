package arima.anotherpack.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLProcedures {
/**
	public static String driver = "com.mysql.jdbc.Driver";
	public static Connection conn = null;
	public static Statement stmt = null;
	public static Logger logger;

	public void connectToMySQL(String host, String username, String password) {
		try {
			logger.logApi("Searching for '" + this.driver + "'");
			Class.forName(driver);
			logger.logApi("Driver Found! Creating a connection to '" + host
					+ "'");
			conn = DriverManager.getConnection(host, username, password);
			logger.logApi("Connected!");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void disconnectFromMySQL() {
		try {
			logger.logApi("Disconnecting from database!");
			this.conn.close();
			logger.logApi("Done!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void executeQuery(String query) {
		String newQuery = query;
		try {
			Statement stmt = this.conn.createStatement();
			stmt.executeUpdate(newQuery);
			logger.logApi("Done!");
		} catch (SQLException e) {
			e.printStackTrace();;
		}

	}

	public void createIndex(String indexName, String table, String queryColumns) {
		String newQuery = "CREATE INDEX " + indexName + " ON " + table + "("
				+ queryColumns + ")";
		try {
			Statement stmt = this.conn.createStatement();
			logger.logApi("Creating INDEX");
			stmt.executeUpdate(newQuery);
			logger.logApi("Done!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void createDatabase(String dbName) {
		String newQuery = "CREATE DATABASE IF NOT EXISTS " + dbName;
		try {
			Statement stmt = this.conn.createStatement();
			logger.logApi("Creating DB");
			stmt.executeUpdate(newQuery);
			logger.logApi("Done!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void createTable(String tableName, String queryColumns) {
		String newQuery = "CREATE TABLE IF NOT EXISTS " + tableName + " (" + queryColumns + ");";
		try {
			Statement stmt = this.conn.createStatement();
			logger.logApi("Creating TABLE");
			stmt.executeUpdate(newQuery);
			logger.logApi("Done!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}**/
}
