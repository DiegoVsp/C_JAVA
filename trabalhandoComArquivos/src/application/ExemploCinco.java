package application;

import java.io.File;
import java.util.Scanner;

public class ExemploCinco {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String strPath = entrada.nextLine();

		
		File path = new File(strPath);
		
		System.out.println("getName: "+path.getName());
		System.out.println("getParent: "+path.getParent());
		System.out.println("getPath: "+path.getPath());
		entrada.close();
	}
}
