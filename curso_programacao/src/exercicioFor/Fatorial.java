package exercicioFor;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero,f=1;
		System.out.println("Digite um n�mero");
		numero = entrada.nextInt();

		for (int i = 1; i <=numero; i++) {
			
			f=i*f;			
			
			System.out.println(f);
		}

		entrada.close();

	}

}
