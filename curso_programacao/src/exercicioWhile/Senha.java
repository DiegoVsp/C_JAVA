package exercicioWhile;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {

		int senha = 2002;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe sua senha");
		int s = entrada.nextInt();

		while (s != senha) {

			System.out.println("Senha Inv�lida");

			System.out.println("Informe sua senha");
			s = entrada.nextInt();
		}

		System.out.println("Acesso permitido");

		entrada.close();
	}
}
