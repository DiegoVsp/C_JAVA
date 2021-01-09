package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramUm {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);
		Rectangle retangle = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		retangle.width = entrada.nextDouble();
		retangle.height = entrada.nextDouble();

		System.out.println(retangle);

		entrada.close();

	}

}
