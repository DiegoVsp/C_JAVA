import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String s1, s2, s3;
		int x;
		// para ler a linha toda tem que ser o .nextLine();

		x = entrada.nextInt();
		entrada.nextLine(); 
		s1 = entrada.nextLine();
		s2 = entrada.nextLine();
		s3 = entrada.nextLine();

		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		entrada.close();
	}
}
