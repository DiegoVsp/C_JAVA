import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		String s = "potato banana apple";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		entrada.close();

	}

}
