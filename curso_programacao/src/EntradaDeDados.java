import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		System.out.println("Digite uma String: ");
		x=entrada.next();
		
		System.out.println("Digite um Inteiro: ");
		y=entrada.nextInt();
		
		System.out.println("Digite um Double: ");
		z=entrada.nextDouble();
		
		System.out.println("Voc� digitou:\n"+x+"\n"+y+"\n"+z);
		entrada.close();
	}
}