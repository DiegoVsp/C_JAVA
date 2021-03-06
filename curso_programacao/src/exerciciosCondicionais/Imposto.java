package exerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double salario, imposto=0;

		System.out.println("Digite o salario: ");
		salario = entrada.nextDouble();

		if (salario <= 2000) {
			imposto = 0.0;
		} else if (salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		} else if (salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if(imposto==0.00) {
			System.out.println("ISENTO");
		}else {
			System.out.printf("R$ %.2f",imposto);			
		}

		entrada.close();
	}
}
