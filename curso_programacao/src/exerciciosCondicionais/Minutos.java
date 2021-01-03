package exerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Minutos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);
		int minutos;
		double conta = 50.0;

		System.out.println("Digite os minutos usados");
		minutos = entrada.nextInt();

		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}

		System.out.printf("Valor conta R$ %.2f",conta);
		entrada.close();
	}
}
