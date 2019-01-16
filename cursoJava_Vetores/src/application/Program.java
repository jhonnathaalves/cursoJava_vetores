package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Quarto [] vect = new Quarto[10];
		int k = 0;
		
		for(int i=0; i< n;i++) {
			System.out.println("Rent # " +(k += 1));
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int j = sc.nextInt();
			vect[j] = new Quarto(nome, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0; i <vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].getNome() + ", " + vect[i].getEmail());
			}
		}
		
		
		
		
		
		
		sc.close();

	}

}
