package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	private static final Rent NULL = null;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int q = sc.nextInt();
		sc.nextLine();
		
		Rent[] rents = new Rent[10];
		
		for (int i = 0; i < q; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			rents[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i < rents.length; i++) {
			if(rents[i] != NULL)
				System.out.println(i + ": " + rents[i].getName() + ", " + rents[i].getEmail());
		}
		
		sc.close();
	}

}
