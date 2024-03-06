package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int tam = sc.nextInt();
		sc.nextLine();
		
		int[] vetor = new int[tam];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0)
				System.out.println(vetor[i]);
		}
		
		sc.close();
	}

}
