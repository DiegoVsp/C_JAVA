package exerciciosCondicionais;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int horaIni, horaFinal, duracao, dia = 24;

		System.out.println("Digite a hora inicial do jogo: ");
		horaIni = entrada.nextInt();

		System.out.println("Digite a hora final do jogo: ");
		horaFinal = entrada.nextInt();

		if (horaIni < horaFinal) {
			duracao = horaFinal - horaIni;
			
		} else{
			duracao = dia - horaIni + horaFinal;
		} 
		System.out.printf("O jogo durou %d HORA(s)", duracao);
		entrada.close();
	}
}
