package exerciciosCondicionais;

import java.util.Scanner;

public class NegativoPositivo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			int numero;
			System.out.println("Digite um n�mero inteiro: ");
			numero=entrada.nextInt();
			
			if(numero>=0) {
				System.out.println("N�mero � positivo");
			}else {
				System.out.println("N�mero negativo");
			}
		entrada.close();
	}
}
