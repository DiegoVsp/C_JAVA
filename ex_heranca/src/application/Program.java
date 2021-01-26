package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;

		if (acc3 instanceof BusinessAccount) { // se a instancia do acc3 for do tipo BusinessAccont então ...
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingAccount) {// se a instancia do acc3 for do tipo SavingAccount então ... faz o
											// downcasting para SavingAccount
			SavingAccount acc5 = (SavingAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

		// Exemplo Sobreposição
		Account acc6 = new Account(1001, "Alex", 1000.0);
		acc6.withdraw(200.00);
		System.out.println(acc6.getBalance());

		Account acc7 = new SavingAccount(1002, "Maria", 1000.00, 0.01);
		acc7.withdraw(200);
		System.out.println(acc7.getBalance());

		Account acc8 = new BusinessAccount(1003, "Mario", 1000.00, 500.00);
		acc8.withdraw(200.00);
		System.out.println(acc8.getBalance());
	}

}
