import java.util.Scanner;

public class bitwise {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int mask = 32;
		int n = entrada.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}

		entrada.close();

	}

}
