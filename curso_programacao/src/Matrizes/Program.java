package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o número");
		int n = entrada.nextInt();
		// Matriz
		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) { // linha
			for (int j = 0; j < mat[i].length; j++) { // coluna
				mat[i][j] = entrada.nextInt();
			}
		}
		System.out.println("Main diagonal");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i]);
		}
		System.out.println("-----------");
		int count = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative Numbers = " + count);
		entrada.close();
	}
}
