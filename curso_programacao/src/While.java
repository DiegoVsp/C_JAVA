import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor");
		int x = entrada.nextInt();

		int soma = 0;
		while (x != 0) {
			soma += x;
			System.out.println("Digite um valor");
			x = entrada.nextInt();
		}
		System.out.println(soma);
		entrada.close();
	}
}
