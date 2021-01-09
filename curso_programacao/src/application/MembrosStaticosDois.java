package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class MembrosStaticosDois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.print("Enter radius: ");
		
		double radius = entrada.nextDouble();

		double c = calc.circunference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		entrada.close();

	}

}
