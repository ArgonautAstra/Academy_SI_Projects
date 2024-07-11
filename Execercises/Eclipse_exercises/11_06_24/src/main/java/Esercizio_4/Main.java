package Esercizio_4;

public class Main {

	public static void main(String[] args) {

		Grades grades = new Grades();

		grades.addStudent("Paolo", 7);
		grades.addStudent("Paolo", 8.75f);
		grades.addStudent("Paolo", 10);
		
		grades.getStatistics();
		
	}

}


