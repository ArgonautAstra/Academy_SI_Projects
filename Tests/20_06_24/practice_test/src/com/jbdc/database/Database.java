package com.jbdc.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.mysql.cj.jdbc.MysqlDataSource;

public class Database {
	
	private Connection connection;
	String serverName, user, password, dbName;
	int portNumber;
	
	public Database() {
		serverName = "localhost";
		user = "root";
		password = "admin";
		portNumber = 3306;
		this.openConnection();
	}

	public Database(String serverName, String user, String password, String dbName, int portNumber) {
		this.serverName = serverName;
		this.user = user;
		this.password = password;
		this.dbName = dbName;
		this.portNumber = portNumber;
		this.openConnection();
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDBName(String dbName) {
		this.dbName = dbName;
	}

	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	private void openConnection() {
		if(connection == null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			
			dataSource.setServerName(this.serverName);
			dataSource.setPortNumber(this.portNumber);
			dataSource.setUser(this.user);
			dataSource.setPassword(this.password);
			
			try {
				connection = dataSource.getConnection();
			} catch (SQLException e) {
				System.out.println("Bad credential access");
				e.printStackTrace();
			}
		}
	}

	public void openConnection(String dbName) {
		
		MysqlDataSource dataSource = new MysqlDataSource();
		
		dataSource.setServerName(this.serverName);
		dataSource.setPortNumber(this.portNumber);
		dataSource.setUser(this.user);
		dataSource.setPassword(this.password);
		dataSource.setDatabaseName(dbName);
		
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			System.out.println("Bad credential access");
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet query(String query) {

		ResultSet resultSet = null;
		ResultSet resultSetTmp = null;
		int i = 0;
		
		try {			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			PreparedStatement preparedStatementTmp = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();
			resultSetTmp = preparedStatementTmp.executeQuery();

			resultSetTmp.next();
			
			try {
				for(i = 1; resultSetTmp.getObject(i) != null; i++);
			} catch (SQLException e) {
				i--;
			}
			
			do{
				for(int j = 1; j <= i; j++)
					System.out.print(resultSetTmp.getObject(j).toString() + ", ");
				System.out.println("");
			}while(resultSetTmp.next());
			
			preparedStatement.close();
			preparedStatementTmp.close();
			
		} catch (SQLException e) {
			System.out.println("Bad query request");
			e.printStackTrace();
		}
		
		return resultSet;
	}

	public void createDatabase(String dbName) {
		try {			
			String query = "DROP DATABASE IF EXISTS " + dbName;
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.executeUpdate();
			
			query = "CREATE DATABASE " + dbName;
					
			preparedStatement = connection.prepareStatement(query);
					
			preparedStatement.executeUpdate();
			
			preparedStatement.close();

		} catch (SQLException e) {
			System.out.println("Bad query request");
			e.printStackTrace();
		}
	}
	
	public void createTable(String nameTable, List<String> type, List<String> name, List<String> constraint) {
		
		int size = name.size();
		
		if(type.size() == size && constraint.size() == size) {

			try {			
				String query = "CREATE TABLE " + nameTable + "(\n";
				
				for(int i = 0; i < size - 1; i++) 
					query += name.get(i) + " " + type.get(i)  + " " + constraint.get(i) + ",\n";
				
				query += name.get(size-1) + " " + type.get(size-1)  + " " + constraint.get(size-1) + "\n)";
				
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				
				preparedStatement.executeUpdate();
				
				preparedStatement.close();

			} catch (SQLException e) {
				System.out.println("Bad query request");
				e.printStackTrace();
			}
		} else {
			System.out.println("Liste dei parametri di lunghezza differente!");
		}
	}
	
	public void insertIntoU(int id, String firstname, String lastname) {

		try {			
			String query = "INSERT INTO U(id_user, firstname, lastname)"
					     + "VALUES(" + id + ",\"" + firstname + "\",\"" + lastname + "\")";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();

		} catch (SQLException e) {
			System.out.println("Bad query request");
			e.printStackTrace();
		}
	}

	public void insertIntoL(int id, String title, String author) {

		try {			
			String query = "INSERT INTO L(id_book, title, author)"
					     + "VALUES(" + id + ",\"" + title + "\",\"" + author + "\")";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();

		} catch (SQLException e) {
			System.out.println("Bad query request");
			e.printStackTrace();
		}
	}

	public void insertIntoP(int id, int id_user, int id_book, String startDate, String endDate) {

		try {			
			String query = "INSERT INTO P "
					     + "VALUES(" + id + "," + id_user + "," + id_book + ",\"" + startDate + "\",\"" + endDate + "\")";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();

		} catch (SQLException e) {
			System.out.println("Bad query request");
			e.printStackTrace();
		}
	}
}
