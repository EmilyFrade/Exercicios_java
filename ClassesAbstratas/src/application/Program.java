package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			
			if (ch == 'i' || ch == 'I') {
				System.out.print("Health expenditures: ");
				Double healthSpendings = sc.nextDouble();
				
				TaxPayer payer = new Individual(name, income, healthSpendings);
				list.add(payer);
			} else {
				System.out.print("Number of employees: ");
				Integer employees = sc.nextInt();
				
				TaxPayer payer = new Company(name, income, employees);
				list.add(payer);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		Double totalTaxes = 0.0;
		for(TaxPayer payer : list) {
			System.out.println(payer.getName() + ": $" + String.format("%.2f", payer.totalTax()));
			totalTaxes += payer.totalTax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalTaxes));
		
		sc.close();
	}

}
