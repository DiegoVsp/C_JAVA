package exerciciosCondicionais;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			int num;
			System.out.println("Digite um n�mero: ");
			num=entrada.nextInt();
			
			if(num%2==0) {
				System.out.println("N�MERO PAR");
			}else {
				System.out.println("N�MERO IMPAR");
			}
		
		entrada.close();
	}
}
