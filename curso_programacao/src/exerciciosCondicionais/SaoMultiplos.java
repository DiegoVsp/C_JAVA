package exerciciosCondicionais;

import java.util.Scanner;

public class SaoMultiplos {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1,n2;
		System.out.println("Descubra se os n�meros s�o multiplos%n");
		System.out.println("Digite o primeiro n�mero: ");
		n1=entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2=entrada.nextInt();
		
		if(n1%n2==0 || n2%n1==0) {
			System.out.println("S�o Multiplos");
		}else {
			System.out.println("N�o s�o Multiplos");
		}
		
		entrada.close();
	}
}
