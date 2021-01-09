package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramDois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);
		
			Funcionario func = new Funcionario();
			
			System.out.println("Digite seu nome: ");
			func.nome=entrada.nextLine();
			
			System.out.println("Digite seu salário: ");
			func.salarioBruto = entrada.nextDouble();
			
			System.out.println("Digite a taxa: ");
			func.taxa = entrada.nextDouble();
			
			System.out.println("Employee"+func);
			
			System.out.println("Which percentage to increase salary? ");
			double percent = entrada.nextDouble();			
			func.IncreaseSalary(percent);
			
			System.out.println("Update data: "+func);
		
		entrada.close();
		
		
	}

}
