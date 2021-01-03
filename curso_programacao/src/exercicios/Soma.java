package exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n1, n2, soma;

		System.out.println("Digite o primeiro valor");
		n1 = entrada.nextInt();

		System.out.println("Digite um segundo valor");
		n2 = entrada.nextInt();

		soma = n1 + n2;

		System.out.println("Soma = " + soma);

		entrada.close();

	}

}
