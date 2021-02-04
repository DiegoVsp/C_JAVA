package application;

import java.io.File;
import java.util.Scanner;

public class ExemploQuatro {

	public static void main(String[] args) {
		// Manipulando pastas com File

		Scanner entrada = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = entrada.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders");

		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile);
		System.out.println("Files");
		for (File file : files) {
			System.out.println(file);
		}
		boolean success = new File(strPath + "\\subdir").mkdir();//criando pasta subdir

		System.out.println("Directory created sucessfully: " + success);
		entrada.close();
	}
}
