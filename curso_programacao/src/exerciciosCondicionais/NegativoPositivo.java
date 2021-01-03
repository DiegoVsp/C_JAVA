package exerciciosCondicionais;

import java.util.Scanner;

public class NegativoPositivo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			int numero;
			System.out.println("Digite um número inteiro: ");
			numero=entrada.nextInt();
			
			if(numero>=0) {
				System.out.println("Número é positivo");
			}else {
				System.out.println("Número negativo");
			}
		entrada.close();
	}
}
