package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.print("What many dollars will be bought? ");
		CurrencyConverter.dollars = sc.nextDouble();
		System.out.println("Amount to be paid in reais: " + String.format("%.2f", CurrencyConverter.converter()));
		
		sc.close();
	}

}
