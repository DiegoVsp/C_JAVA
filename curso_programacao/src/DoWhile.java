import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		char cond;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = entrada.nextDouble();

			double f = 9.0 * (c / 5) + 32;
			System.out.printf("Temperatura em Farenheit %.1f%n", f);

			System.out.print("Deseja continuar? S / N ");
			cond = entrada.next().charAt(0);

		} while (cond == 's'||cond=='S');
		entrada.close();
	}

}
