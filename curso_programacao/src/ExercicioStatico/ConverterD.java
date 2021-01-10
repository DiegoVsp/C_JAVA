package ExercicioStatico;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrentConverter;

public class ConverterD {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Whats is the dollar price? ");		
		double cotacaoDolar = entrada.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double qtdDolar = entrada.nextDouble();
		
		double valorReais = CurrentConverter.EmReais(qtdDolar,cotacaoDolar);
		
		System.out.printf("Amount to be paid in reais = %.2f",valorReais);
		
		entrada.close();

	}

}
