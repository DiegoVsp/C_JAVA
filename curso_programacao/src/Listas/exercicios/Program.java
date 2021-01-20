package Listas.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Exercicio Lista2
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		List<Func> list = new ArrayList<>();
		
		System.out.println("Quantos empregados deseja cadastrar?");
		int n = entrada.nextInt();
		entrada.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("#%dº Funcionário", (i+1));
			System.out.println("Id : ");
			int id = entrada.nextInt();
			
			System.out.println("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();
			
			System.out.println("Salario: ");
			double salario = entrada.nextDouble();
			
			Func empregado = new Func(id, nome, salario);
			
			list.add(empregado);
		}
		
		
		entrada.close();
	}
}
