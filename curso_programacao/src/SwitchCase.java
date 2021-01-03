import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numeroSem;
		String dia;

		System.out.println("Digite o n�mero da semana: ");
		numeroSem = entrada.nextInt();

		switch (numeroSem) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Ter�a-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "S�bado";
			break;
		default:
			dia = "Dia Semana Inv�lido";
			break;
		}
		System.out.println(dia);
		entrada.close();
	}
}
