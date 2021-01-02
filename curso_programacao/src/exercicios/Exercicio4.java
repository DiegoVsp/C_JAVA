package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int numero, horas;
		double valorHora,salario;
		
		System.out.println("Digite o número do funcionário: ");
		numero=entrada.nextInt();
		System.out.println("Digite a quantidade de horas Trabalhadas: ");
		horas=entrada.nextInt();
		System.out.println("Digite o Valor que recebe por Hora");
		valorHora=entrada.nextDouble();
		
		salario = horas*valorHora;
		System.out.printf("NUMBER = %d%n",numero);
		System.out.printf("SALARY = U$ %.2f",salario);
		entrada.close();
	}
}
