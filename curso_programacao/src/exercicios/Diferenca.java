package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int A, B, C, D, Dif;

		System.out.println("Digite o valor de A");
		A = entrada.nextInt();
		System.out.println("Digite o valor de B");
		B = entrada.nextInt();
		System.out.println("Digite o valor de C");
		C = entrada.nextInt();
		System.out.println("Digite o valor de D");
		D = entrada.nextInt();

		Dif = (A * B - C * D);
		
		System.out.println(Dif);
		
		entrada.close();

	}

}
