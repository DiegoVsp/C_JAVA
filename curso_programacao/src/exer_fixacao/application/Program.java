package exer_fixacao.application;

import java.util.Locale;
import java.util.Scanner;

import exer_fixacao.entities.Account;

public class Program {

	public static void main(String[] args) {
		//Correção
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter the account number: ");
		int number = entrada.nextInt();
		
		System.out.println("Enter the account number: ");
		entrada.nextLine(); // para consumir a quebra de linha que ficou pendente no nextInt
		String holder = entrada.nextLine();
		
		System.out.println("Is there an initial deposit? (y/n)");
		char response = entrada.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter the initial value");
			double initialDeposit = entrada.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(""+account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = entrada.nextDouble();	
		account.deposit(depositValue);
		
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = entrada.nextDouble();	
		account.withdraw(withdrawValue);
		
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		entrada.close();
	}
}
