package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("c:\\temp\\in.txt");

		Scanner entrada = null;
		try {
			entrada = new Scanner(file);// instanciar o scanner a partir desse arquivo(file)
			while (entrada.hasNextLine()) { // hasNextLine -> pra testar se ainda existe uma nova linha no arquivo
				System.out.println(entrada.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		} finally { // boa prática - colocar o fechamento de seu recurso no bloco finally
			if (entrada != null) {
				entrada.close();
			}
		}
	}

}
