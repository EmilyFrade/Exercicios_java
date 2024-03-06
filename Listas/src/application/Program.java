package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int q = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < q; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i+1) + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee x = new Employee(id, name, salary);
			list.add(x);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee y = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		
		if(y == null)
			System.out.println("This id does not exist!");
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			y.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee x: list) {
			System.out.println(x.getID() + ", " + x.getName() + ", " + String.format("%.2f", x.getSalary()));
		}
		
		sc.close();
	}

}
