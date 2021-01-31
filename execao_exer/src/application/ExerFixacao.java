package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class ExerFixacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = entrada.nextInt();

		System.out.print("Holder: ");
		entrada.nextLine();
		String holder = entrada.nextLine();

		System.out.print("Initial balance: ");
		double balance = entrada.nextDouble();

		System.out.print("Withdraw limit: ");
		double withdrawLimit = entrada.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);

		System.out.println(" ");

		System.out.print("Enter amount for withdraw: ");
		double amount = entrada.nextDouble();
		try {
			acc.withdraw(amount);

			System.out.println(acc);
		} catch (Exception e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		entrada.close();
	}
}
