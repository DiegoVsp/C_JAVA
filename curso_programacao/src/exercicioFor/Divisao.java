package exercicioFor;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		double r =0;
		System.out.println("Entre com o contador: ");
		int cont = entrada.nextInt();

		for (int i = 0; i < cont; i++) {
			
			System.out.println("Entre com o dividendo: ");
			double dividendo = entrada.nextDouble();

			System.out.println("Entre com o divisor: ");
			double divisor = entrada.nextDouble();
			
			if(divisor == 0) {
				System.out.println("divis�o impossivel ");
			}else {
				r= dividendo/divisor;
				System.out.printf("%.1f%n",r);
			}

		}

		entrada.close();

	}

}
