package vetores;

import java.util.Locale;
import java.util.Scanner;



public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		Produto[] vect = new Produto[n];
		

		for (int i = 0; i < vect.length; i++) { // n ou vect.length
			entrada.nextLine(); // colocar para consumir a quebra de linha que ficou pendente no nextInt();
			System.out.println("Digite um nome: ");
			String name = entrada.nextLine();
			
			System.out.println("Digite um preço: ");
			double price = entrada.nextDouble();

			vect[i] = new Produto(name, price);
		}
		
		double soma = 0.0;
		
		for(int i = 0; i< vect.length;i++) {
			soma+=vect[i].getPrice();
		}
		double media = soma/vect.length;
		System.out.printf("A  média é de $ %.2f",media);

		entrada.close();
	}
}
