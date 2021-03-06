package exercicioFor;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int cont;

		System.out.println("Digite o n�mero de notas");
		cont = entrada.nextInt();

		for (int i = 0; i < cont; i++) {
			System.out.println("Digite a primeira nota");
			double nota1 = entrada.nextDouble();

			System.out.println("Digite a segunda nota");
			double nota2 = entrada.nextDouble();

			System.out.println("Digite a terceira nota");
			double nota3 = entrada.nextDouble();

			double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10;

			System.out.printf("Media Ponderada = %.1f%n", media);
		}

		entrada.close();
	}

}
