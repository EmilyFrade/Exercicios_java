package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int t = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] pessoas = new Pessoa[t];
		double alturaMedia = 0;
		int menos16 = 0;
		
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoa();
			
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			pessoas[i].setNome(sc.nextLine());
			System.out.print("Idade: ");
			pessoas[i].setIdade(sc.nextInt());
			System.out.print("Altura: ");
			pessoas[i].setAltura(sc.nextDouble());
			sc.nextLine();
			
			alturaMedia += pessoas[i].getAltura();
			
			if(pessoas[i].getIdade() < 16)
				menos16++;
		}
		
		System.out.println();
		System.out.printf("Altura media: %.2f%n", alturaMedia / pessoas.length);
		
		System.out.println("Pessoas com menos de 16 anos: " + ((double)menos16 / pessoas.length * 100.0) + "%");
		for(int i =0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16)
				System.out.println(pessoas[i].getNome());
		}
		
		sc.close();
	}

}
