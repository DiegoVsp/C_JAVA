package Matrizes.exer_prop;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com um número de linhas");
		int linha = entrada.nextInt();

		System.out.println("Entre com um número de colunas");
		int colunas = entrada.nextInt();

		int[][] mat = new int[linha][colunas];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = entrada.nextInt();
			}
		}

		System.out.println("Entre com o número que deseja encontrar:");
		int num = entrada.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == num) {
					System.out.printf("posicão " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("UP: " + mat[i - 1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("DOWN: " + mat[i+1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("RIGHT: " + mat[i][j+ 1]);
					}
				}

			}
		}

		entrada.close();
	}
}
