package com.jbdc.database;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Istanziamento del DB con una connessione SENZA accesso al DB
		Database database = new Database();

		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> field = new ArrayList<>();
		ArrayList<String> constraint = new ArrayList<>();

		// Creazione del DB nella connessione esistente 
		database.createDatabase("academy");

		// Chiusura della connessione esistente e riapertura con accesso al DB
		database.openConnection("academy");
		
		// *** Creazione tabella U ***
		
		name.add("id_user");
		field.add("INT");
		constraint.add("PRIMARY KEY");
		
		name.add("firstname");
		field.add("VARCHAR(255)");
		constraint.add("NOT NULL");
		
		name.add("lastname");
		field.add("VARCHAR(255)");
		constraint.add("NOT NULL");
		
		database.createTable("U", field, name, constraint);
		
		name.clear();
		field.clear();
		constraint.clear();
		
		// *** Creazione tabella L ***

		name.add("id_book");
		field.add("INT");
		constraint.add("PRIMARY KEY");
		
		name.add("title");
		field.add("VARCHAR(255)");
		constraint.add("NOT NULL");
		
		name.add("author");
		field.add("VARCHAR(255)");
		constraint.add("NOT NULL");
		
		database.createTable("L", field, name, constraint);
		
		name.clear();
		field.clear();
		constraint.clear();
		
		// *** Creazione tabella P ***

		name.add("id_loan");
		field.add("INT");
		constraint.add("PRIMARY KEY");

		name.add("id_book");
		field.add("INT");
		constraint.add("NOT NULL");

		name.add("id_user");
		field.add("INT");
		constraint.add("NOT NULL");
		
		name.add("startDate");
		field.add("DATE");
		constraint.add("NOT NULL");
		
		name.add("endDate");
		field.add("DATE");
		constraint.add("DEFAULT NULL");
		
		name.add("");
		field.add("");
		constraint.add("FOREIGN KEY(id_user) REFERENCES U(id_user)");

		name.add("");
		field.add("");
		constraint.add("FOREIGN KEY(id_book) REFERENCES L(id_book)");
		
		database.createTable("P", field, name, constraint);
		
		name.clear();
		field.clear();
		constraint.clear();
		
		// *** Inserimento tabella U ***

		database.insertIntoU(1, "Mario", "Rossi");
		database.insertIntoU(2, "Andrea", "Verdi");
		database.insertIntoU(3, "Massimo", "Bianchi");
		database.insertIntoU(4, "Sara", "Vallieri");
		database.insertIntoU(5, "Marco", "Graviglia");
		database.insertIntoU(6, "Marzia", "Esposito");
		
		// *** Inserimento tabella L ***

		database.insertIntoL(1, "Transistor", "Coppelli");
		database.insertIntoL(2, "Compilatore", "Ranieri");
		database.insertIntoL(3, "Diodi", "Stortoni");
		database.insertIntoL(4, "Algoritmi", "Sedge");
		database.insertIntoL(5, "Pascal", "Wirth");
		
		// *** Inserimento tabella P ***		
		
		database.insertIntoP(1,3,6,"2005-02-10","2005-06-15");
		database.insertIntoP(2,1,6,"2015-12-10","2015-12-15");
		database.insertIntoP(3,2,5,"2002-06-25","2010-07-01");
		database.insertIntoP(4,5,4,"2014-09-14","2014-09-15");
		database.insertIntoP(5,4,4,"2020-04-27","2021-07-01");
		database.insertIntoP(6,4,3,"2020-05-21","2020-05-30");
		
		// *** Query ***
		
		// Query_1		
		database.query("SELECT title \n"
					 + "FROM P \n"
					 + "JOIN U ON P.id_user = U.id_user \n"
					 + "JOIN L ON P.id_book = L.id_book \n"
					 + "WHERE lastname = 'Vallieri' \n"
					 + "ORDER BY title;"
					 );
		
		System.out.println();
		
		// Query_2
		database.query("SELECT lastname, COUNT(title) as readed \n"
					 + "FROM P \n"
					 + "JOIN U ON P.id_user = U.id_user \n"
					 + "JOIN L ON P.id_book = L.id_book \n"
					 + "GROUP BY lastname \n"
					 + "ORDER BY readed DESC \n"
					 + "LIMIT 3;"
					 );
		
		System.out.println();
		
		// Query_3
		database.query("SELECT firstname, lastname, title \n"
					 + "FROM P \n"
					 + "JOIN U ON P.id_user = U.id_user \n"
					 + "JOIN L ON P.id_book = L.id_book \n"
					 + "WHERE title IS NULL;"
					 );		
		
		System.out.println();
		
		// Query_4
		database.query("SELECT firstname, lastname, title \n"
					 + "FROM P \n"
					 + "JOIN U ON P.id_user = U.id_user \n"
					 + "JOIN L ON P.id_book = L.id_book \n"
					 + "WHERE firstname = 'Marzia' \n"
					 + "AND lastname = 'Esposito' \n"
					 + "AND startDate BETWEEN '2000-01-01' AND '2030-01-01' \n"
					 + "AND startDate BETWEEN '2000-01-01' AND '2030-01-01';"
					 );
		
		System.out.println();
		
		// Query_5
		database.query("SELECT COUNT(title) AS rankBook, title \n"
					 + "FROM P \n"
					 + "JOIN L ON P.id_book = L.id_book \n"
					 + "GROUP BY title \n"
					 + "ORDER BY rankBook DESC;"
					 );
		
		System.out.println();
		
		// Query_6
		database.query("SELECT * \n"
					 + "FROM P \n"
					 + "WHERE DAY(endDate) - DAY(startDate) >= 15 \n;"
					 );
		
		// Chiusura della connessione
		database.closeConnection();
	}	
}