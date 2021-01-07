package exercicioFor;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor para X: ");
		int x = entrada.nextInt();
		for(int i = 0; i<=x;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		entrada.close();

	}

}
