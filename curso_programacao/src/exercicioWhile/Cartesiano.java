package exercicioWhile;

import java.util.Scanner;

public class Cartesiano {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int x, y;

		System.out.println("Digite um valor pra X: ");
		x = entrada.nextInt();

		System.out.println("Digite um valor pra Y: ");
		y = entrada.nextInt();

		while (x != 0 && y != 0) {
			if(x>0 && y>0) {
				System.out.println("1� Quandrante");
			}else if(x<0 && y>0) {
				System.out.println("2� Quadrante");
			}else if(x<0 && y<0) {
				System.out.println("3� Quadrante");
			}else {
				System.out.println("4� Quadrante");
			}
			System.out.println("Digite um valor pra X: ");
			x = entrada.nextInt();

			System.out.println("Digite um valor pra Y: ");
			y = entrada.nextInt();
		}
		System.out.println("Fim");
		entrada.close();
	}
}
