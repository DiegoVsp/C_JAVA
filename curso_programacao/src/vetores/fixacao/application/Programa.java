package vetores.fixacao.application;

import java.util.Locale;
import java.util.Scanner;

import vetores.fixacao.entities.Aluguel;

public class Programa {

	public static void main(String[] args) {
		//Exercicios Quartos alugados
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);		
		
		System.out.println("Quantos quartos de aluguel? ");
		int nquartos = entrada.nextInt();
		
		Aluguel[] quartos = new Aluguel[nquartos]; //vetor de 10
		
		System.out.println("Quantos quartos serão alugados? ");
		int num = entrada.nextInt();
		
		for(int i =0; i<num;i++) {
			System.out.println();
			System.out.printf("Rent #%d%n",i+1);
			System.out.print("Name: ");			
			entrada.nextLine();
			String nome = entrada.nextLine();
			
			System.out.print("Email: ");
			String email = entrada.nextLine();
			
			System.out.print("Room: ");
			int numero = entrada.nextInt();	
			
			quartos[numero] = new Aluguel(nome, email, numero);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i<quartos.length;i++) {
			if(quartos[i]!=null) {
				System.out.println(i+""+quartos[i]);
			}
		}	
		
		//System.out.println("rooms: ");
		//for(int i = 0; i<quartos.length;i++) {
			
		//		System.out.println(i+""+quartos[i]);
			
		//}	
		
		entrada.close();
	}
}


