package constructor.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		
		double deposito;
		
		System.out.print("Enter account number: ");
		int accountNumber = entrada.nextInt();
		
		System.out.print("Enter the account holder: ");
		String titular = entrada.next();
		
		Conta conta = new Conta(accountNumber,titular);
		
		entrada.nextLine();
		
		System.out.print("Is there a initial deposit value (y/n) ? ");
		char opcao = entrada.nextLine().charAt(0);
		
		
		if(opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposito = entrada.nextDouble();
			conta.deposito(deposito);
		}
		
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.print("Enter a deposit value: ");
		double valorDeposito = entrada.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		System.out.print("Enter a withdraw value: ");
		double valorSaque = entrada.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		entrada.close();

	}

}
