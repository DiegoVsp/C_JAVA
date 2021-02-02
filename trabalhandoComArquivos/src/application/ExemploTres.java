package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploTres {
	public static void main(String[] args) {

		String[] lines = new String[] { "Good Morning", "Good afternoon", "Good night" };
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){//parametro true indica que vc não quer recriar o arquivo
			for(String line : lines) {
				bw.write(line);// por padrao write não tem a quebra de linha
				bw.newLine();//para dar a quebra de linha
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
