package Esercizio_4;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Grades {

	private File grades, stats; 
	private ArrayList<String> students;
	
	public Grades(){
		grades = new File("src/main/java/Esercizio_4/log/grades.txt");
		stats = new File("src/main/java/Esercizio_4/log/statistics.txt");
		students = new ArrayList<>();
		this.getStudents();
	}
	
	public void addStudent(String student, float grade) {
		
		try {
			BufferedWriter output = new BufferedWriter(new FileWriter(grades,true));
			
			if(grade >= 0 && grade <= 10) {
				output.append("\n" + student + "," + grade);
					if(!students.contains(student)) {
						students.add(student);
					}
			}else {
				System.out.println("Student not added");
			}
				
			output.close();
			
		}catch(IOException e){
			e.getStackTrace();
		}
	}
	
	public void getStudents() {
		
		String student;
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(grades));
			
			while((student = input.readLine()) != null) {
				student = student.split(",")[0];
				if(!students.contains(student)) {
					students.add(student);
				}
			}
			
			input.close();
			
			
		}catch(IOException e){
			e.getStackTrace();
		}
	}	
	
	public void getStatistics() {
		
		try {
			BufferedWriter output = new BufferedWriter(new FileWriter(stats));
			
			for(String student : students){
				output.write(student + "\nVoto minimo: " + this.minGrade(student)
								 	 + "\nVoto medio: " + this.avgGrade(student)
									 + "\nVoto massimo: " + this.maxGrade(student) + "\n");
			}
			
			output.close();
			
		}catch(IOException e){
			e.getStackTrace();
		}
	}
	
	@SuppressWarnings("finally")
	public float minGrade(String student) {
		
		float min = 10, tmp;
		String line;
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(grades));
			
			while((line = input.readLine()) != null) {
				if(line.contains(student)) {
					tmp = Float.parseFloat(line.split(",")[1]);
					min = (tmp < min) ? tmp : min;
				}
			}
	
			input.close();
			
		}catch(IOException e){
			e.getStackTrace();
		}finally{
			return min;
		}
	}
	
	@SuppressWarnings("finally")
	public float avgGrade(String student) {
		
		float avg = 0, count = 0;;
		String line;
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(grades));
			
			while((line = input.readLine()) != null) {
				if(line.contains(student)) {
					avg += Float.parseFloat(line.split(",")[1]);
					count++;
				}
			}
			
			avg = avg/count;
	
			input.close();
			
		}catch(IOException e){
			e.getStackTrace();
		}finally{
			return avg;
		}
	}

	@SuppressWarnings("finally")
	public float maxGrade(String student) {
		
		float max = 0, tmp;
		String line;
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(grades));
			
			while((line = input.readLine()) != null) {
				if(line.contains(student)) {
					tmp = Float.parseFloat(line.split(",")[1]);
					max = (tmp > max) ? tmp : max;
				}
			}
	
			input.close();
			
		}catch(IOException e){
			e.getStackTrace();
		}finally{
			return max;
		}
	}

}
