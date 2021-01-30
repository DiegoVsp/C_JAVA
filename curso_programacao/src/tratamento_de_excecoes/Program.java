package tratamento_de_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println("End of program");
	}
	public static void method1() {
		System.out.println("***Method1 Start***");
		method2();
		System.out.println("***Method1 Start***");
	}

	public static void method2() {
		System.out.println("***Method2 Start***");
		
		Scanner entrada = new Scanner(System.in);
		try {
			String[] vect = entrada.nextLine().split(" ");
			int position = entrada.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace();
			entrada.next();
		} catch (InputMismatchException e) {
			System.out.println("Input Error ");
		}
		
		entrada.close();
		System.out.println("***Method2 End***");
	}
}
