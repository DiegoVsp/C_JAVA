package exercicioFor;

import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int in = 0, out = 0;
		
		System.out.println("Digite um valor inteiro");
		int n = entrada.nextInt();

		for (int i = 0; i < n; i++) {
			
			System.out.println("Digite n�meros inteiros");
			int valores = entrada.nextInt();
			
			if(valores>=10 && valores<=20) {
				in++;
				
			}else {
				out++;
				
			}
		}
		System.out.printf("%d in%n",in);
		System.out.printf("%d out",out);
		entrada.close();

	}

}
