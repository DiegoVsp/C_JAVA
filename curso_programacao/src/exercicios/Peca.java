package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Peca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int numeroPeca, qtdPeca, numeroPeca2, qtdPeca2;
		double valorPeca, valorPeca2,total;

		System.out.println("Digite o n�mero da primeira pe�a: ");
		numeroPeca = entrada.nextInt();

		System.out.println("Digite a quantidade da primeira Pe�a: ");
		qtdPeca = entrada.nextInt();

		System.out.println("Digite o valor unit�rio da primeira Pe�a: ");
		valorPeca = entrada.nextDouble();
		
		System.out.println("Digite o n�mero da segunda pe�a: ");
		numeroPeca2 = entrada.nextInt();

		System.out.println("Digite a quantidade da segunda Pe�a: ");
		qtdPeca2 = entrada.nextInt();

		System.out.println("Digite o valor unit�rio da segunda Pe�a: ");
		valorPeca2 = entrada.nextDouble();
		
		total = (qtdPeca*valorPeca)+(qtdPeca2*valorPeca2);
		
		System.out.printf("n� pe�a 1 %d e n� peca 2 %d%n",numeroPeca,numeroPeca2);
		System.out.printf("Valor a Pagar � de: %.2f",total);
		

		entrada.close();
	}
}
