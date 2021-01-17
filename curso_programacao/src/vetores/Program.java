package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		double soma = 0;
		
		double[] vetor = new double[n];
		
		for(int i = 0; i< n;i++) {
			vetor[i] = entrada.nextDouble();
			soma += vetor[i];
		}
		
	
		double media = soma/n;
		System.out.printf("Averange Height %.2f%n", media);
		entrada.close();
	}

}
