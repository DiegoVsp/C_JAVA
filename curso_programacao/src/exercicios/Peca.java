package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Peca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int numeroPeca, qtdPeca, numeroPeca2, qtdPeca2;
		double valorPeca, valorPeca2,total;

		System.out.println("Digite o número da primeira peça: ");
		numeroPeca = entrada.nextInt();

		System.out.println("Digite a quantidade da primeira Peça: ");
		qtdPeca = entrada.nextInt();

		System.out.println("Digite o valor unitário da primeira Peça: ");
		valorPeca = entrada.nextDouble();
		
		System.out.println("Digite o número da segunda peça: ");
		numeroPeca2 = entrada.nextInt();

		System.out.println("Digite a quantidade da segunda Peça: ");
		qtdPeca2 = entrada.nextInt();

		System.out.println("Digite o valor unitário da segunda Peça: ");
		valorPeca2 = entrada.nextDouble();
		
		total = (qtdPeca*valorPeca)+(qtdPeca2*valorPeca2);
		
		System.out.printf("nº peça 1 %d e nº peca 2 %d%n",numeroPeca,numeroPeca2);
		System.out.printf("Valor a Pagar é de: %.2f",total);
		

		entrada.close();
	}
}
