package ex_classe_abstrata.application;

import java.util.ArrayList;
import java.util.List;

import ex_classe_abstrata.entities.Account;
import ex_classe_abstrata.entities.BusinessAccount;
import ex_classe_abstrata.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 500.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

		double soma = 0.0;
		for (Account acc : list) {
			soma += acc.getBalance();
		}
		System.out.printf("%.2f%n", soma);

		for (Account acc : list) {
			acc.deposit(10.00);
		}
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}