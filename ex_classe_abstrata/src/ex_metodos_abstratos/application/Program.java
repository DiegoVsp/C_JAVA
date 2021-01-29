package ex_metodos_abstratos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ex_metodos_abstratos.Color;
import ex_metodos_abstratos.entities.Circulo;
import ex_metodos_abstratos.entities.Retangulo;
import ex_metodos_abstratos.entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		List<Shape> lista = new ArrayList<>();

		System.out.println("Enter the number of shapes: ");
		int n = entrada.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Retangulo ou Circulo (r/c)? : ");
			char ch = entrada.next().charAt(0);

			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(entrada.next());

			if (ch == 'r') {
				System.out.println("Width: ");
				double width = entrada.nextDouble();
				System.out.println("Height: ");
				double height = entrada.nextDouble();

				lista.add(new Retangulo(color, width, height));

			} else{
				System.out.println("Radius: ");
				double radius = entrada.nextDouble();
				lista.add(new Circulo(color, radius));
			}

		}
		System.out.println("");
		System.out.println("Areas: ");
		for(Shape shape:lista) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		entrada.close();

	}
}
