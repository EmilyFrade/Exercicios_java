package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int tam = sc.nextInt();
		sc.nextLine();
		
		double[] vetor = new double[tam];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.print("Valores: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			soma += vetor[i];
		}
		
		System.out.println();
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("Media: %.2f%n", soma / vetor.length);
		
		sc.close();
	}

}
