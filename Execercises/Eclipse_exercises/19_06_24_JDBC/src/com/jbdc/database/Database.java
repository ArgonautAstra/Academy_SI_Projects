package com.jbdc.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

import com.mysql.cj.jdbc.MysqlDataSource;

// *** Installazione manuale del JDBC ***
//
// 1. Creare una cartella <db> sotto la cartella del Java Project.
// 2. Inserire dentro <db> il file jar del connector mysql.
// 3. Tasto destro sulla cartella del progetto e seguire il percorso: 
//    Build Path/Configure Build Path/Libraries/Modulepaths, dopodiché 
//    fare Add JARs e aggiungere il percorso del file jar inserito.
// 4. Importare le opportune classi richieste dal codice
//
// *** Classe Database ***
// Questa classe offre metodi standard per la connessione e interrogazione
// al Database passato al costruttore, in alternativa al localhost

public class Database {
	
	private Connection connection;
	String serverName, user, password, dbName;
	int portNumber;
	
	// Costruttore vuoto per la connessione al localhost.
	public Database() {
		serverName = "localhost";
		user = "root";
		password = "admin";
		dbName = "academy";
		portNumber = 3306;
	}

	// Costruttore per la connessione ad un determinato Database.
	public Database(String serverName, String user, String password, String dbName, int portNumber) {
		this.serverName = serverName;
		this.user = user;
		this.password = password;
		this.dbName = dbName;
		this.portNumber = portNumber;
	}

	// Setter del serverName nel caso il costruttore standard ne imposta uno errato.
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	// Setter dell' user nel caso il costruttore standard ne imposta uno errato.
	public void setUser(String user) {
		this.user = user;
	}

	// Setter della password nel caso il costruttore standard ne imposta una errata.
	public void setPassword(String password) {
		this.password = password;
	}

	// Setter del dbName nel caso il costruttore standard ne imposta uno errato.
	public void setDBName(String dbName) {
		this.dbName = dbName;
	}

	// Setter della portNumber nel caso il costruttore standard ne imposta una errata.
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	// Apertura della connessione al Database con le credenziali passate a parametro
	// o credenziali standard o credenziali settate singolarmente.
	public void openConnection() {
		if(connection == null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			
			dataSource.setServerName(this.serverName);
			dataSource.setPortNumber(this.portNumber);
			dataSource.setUser(this.user);
			dataSource.setPassword(this.password);
			dataSource.setDatabaseName(this.dbName);
			
			try {
				connection = dataSource.getConnection();
			} catch (SQLException e) {
				System.out.println("Bad credential access");
				e.printStackTrace();
			}
		}
	}

	// Chiusura della connessione al Database
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Richiesta e restituzione della query passata al Database.
	// Mostra il risultato della query.
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

	// Richiesta e restituzione della query passata al Database.
	// Mostra il risultato della query.
	public void action(String query) {

		try {			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
			
			preparedStatement.close();

		} catch (SQLException e) {
			System.out.println("Bad query request");
			e.printStackTrace();
		}
	}
	
}
