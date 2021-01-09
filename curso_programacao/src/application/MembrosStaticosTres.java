package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorDois;

public class MembrosStaticosTres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		

		System.out.print("Enter radius: ");
		
		double radius = entrada.nextDouble();

		double c = CalculatorDois.circunferencia(radius);

		double v = CalculatorDois.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorDois.PI);

		entrada.close();
	}
}
