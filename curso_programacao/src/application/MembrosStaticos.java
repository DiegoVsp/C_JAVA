package application;

import java.util.Locale;
import java.util.Scanner;

public class MembrosStaticos {

	public static final double PI = 3.14159; // valor constante

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = entrada.nextDouble();

		double c = circunference(radius);

		double v = volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);

		entrada.close();
	}

	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}
}
