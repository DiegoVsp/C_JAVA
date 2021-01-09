package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Grade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome: ");
		aluno.nome = entrada.nextLine();
		
		System.out.println("Nota1: ");
		aluno.nota1 = entrada.nextDouble();
		
		System.out.println("Nota2: ");
		aluno.nota2 = entrada.nextDouble();
		
		System.out.println("Nota3: ");
		aluno.nota3 = entrada.nextDouble();
		
		
		System.out.println("Nota Final = "+ aluno.NotaFinal());
		
		if(aluno.NotaFinal()<60) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f POINTS",aluno.PontosFalta());
		}else {
			System.out.println("PASS");
		}
		
		entrada.close();

	}

}
