package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		final double PI = 3.14159;
		double raio ,area;	
	
		System.out.println("Digite o valor do raio");
		raio = entrada.nextDouble();
		
		area = PI*Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n",area);
		entrada.close();
	}

}
