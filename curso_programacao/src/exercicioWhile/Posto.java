package exercicioWhile;

import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int combustivel;
		int alcool=0, gasolina=0, diesel=0;
		
		System.out.println("Informe sua prefer�ncia:");
		System.out.println("\n1-Alcool\n2-Gasolina\n3-Diesel\n4-FIM");
		combustivel = entrada.nextInt();
		
		while(combustivel!=4) {
			if(combustivel<1 || combustivel>4) {
				System.out.println("Informe novo C�digo");
			}else {
				switch(combustivel) {
				case 1:
					alcool++;
					break;
				case 2:
					gasolina++;
					break;
				case 3:
					diesel++;
					break;
				}
			}
			
			combustivel = entrada.nextInt();
		}
		System.out.println("Muito Obrigado!");
		System.out.printf("Alcool %d,%nGasolina %d,%nDiesel %d,%n",alcool,gasolina,diesel);
		
		entrada.close();
	}
}
