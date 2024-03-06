package entities;

public class Student {
	public String name;
	public double[] grades = new double[3];
	
	public double finalGrade() {
		double grade = 0;
		
		for (int i = 0; i < 3; i++)
			grade += grades[i];
		
		return grade;
	}
	
	public void pass() {
		if (finalGrade() > 60.0)
			System.out.println("Pass");
		else {
			System.out.println("Failed");
			System.out.println("Missing " + (60.0 - finalGrade()) + " points");
		}
	}
}


