package ex_metodos_abstratos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ex_metodos_abstratos.entities.Fisica;
import ex_metodos_abstratos.entities.Juridica;
import ex_metodos_abstratos.entities.Pessoa;

public class Programa {
//Pessoa F / J
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = entrada.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Taz payer #%d data%n", (i + 1));
			System.out.print("Individual or Company (i/c)? ");
			char ch = entrada.next().charAt(0);
			System.out.print("Name: ");
			entrada.nextLine();
			String nome = entrada.nextLine();

			System.out.print("Anual income: ");
			double rendaAnual = entrada.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = entrada.nextDouble();

				list.add(new Fisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Number of Employees: ");
				int numeroFuncionarios = entrada.nextInt();

				list.add(new Juridica(nome, rendaAnual, numeroFuncionarios));
			}

		}

		System.out.println("");
		System.out.println("Taxes Paid:");
		for(Pessoa p : list) {
			System.out.println(p.getNome()+": "+String.format("%.2f", p.taxa()));
		}
		double total = 0.0;
		System.out.println("Taxes Paid:");
		for(Pessoa p : list) {
			total+= p.taxa();
		}
		System.out.printf("TOTAL TAXES: $ %.2f", total);
		
		entrada.close();
	}
}
