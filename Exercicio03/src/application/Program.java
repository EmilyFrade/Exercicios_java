package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grades[0] = sc.nextDouble();
		student.grades[1] = sc.nextDouble();
		student.grades[2] = sc.nextDouble();
		
		System.out.println("Final grade: " + String.format("%.2f", student.finalGrade()));
		student.pass();
		
		sc.close();
	}

}
