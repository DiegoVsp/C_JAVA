package exerciciosCondicionais;

import java.util.Scanner;

public class TotalPagar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int codigo, quant;
		double valor = 0;

		System.out.println("Digite o c�digo do produto: ");
		codigo = entrada.nextInt();
		if (codigo < 1 || codigo > 5) {
			System.out.println("C�digo Inv�lido");
		} else {
			System.out.println("Digite a quantidade do produto: ");
			quant = entrada.nextInt();

			if (codigo < 1 || codigo > 5) {
				System.out.println("");
			}
			if (codigo == 1) {
				valor = 4.00 * quant;
			} else if (codigo == 2) {
				valor = 4.50 * quant;
			} else if (codigo == 3) {
				valor = 5.00 * quant;
			} else if (codigo == 4) {
				valor = 2.00 * quant;
			} else if (codigo == 5) {
				valor = 1.50 * quant;
			}
			System.out.printf("O total � de %.2f", valor);
		}

		entrada.close();
	}
}
