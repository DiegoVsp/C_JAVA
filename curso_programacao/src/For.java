import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n,soma=0;
		System.out.println("Informe um n�mero");
		n = entrada.nextInt();
		
		for(int i = 0;i<n;i++) {
			int x = entrada.nextInt();
			soma+=x;
		}
		System.out.println(soma);
		entrada.close();

	}

}
