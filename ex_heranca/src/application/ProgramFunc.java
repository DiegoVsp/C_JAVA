package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class ProgramFunc {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("Entre com a quantidade de Funcionários: ");
		int nFunc = entrada.nextInt();

		for (int i = 0; i < nFunc; i++) {
			System.out.printf("Dados do #%d Funcionário%n", (i + 1));

			System.out.println("Funcionário é tercerisado? (s/n)");
			char ch = entrada.next().charAt(0);

			System.out.println("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();

			System.out.println("Horas: ");
			int horas = entrada.nextInt();

			System.out.println("Valor por hora: ");
			double valorHora = entrada.nextDouble();
			if (ch == 's') {
				System.out.println("Valor da dispesa adicional: ");
				double addicionalCharge = entrada.nextDouble();
				Funcionario terc = new FuncionarioTercerizado(nome, horas, valorHora, addicionalCharge);
				list.add(terc);
				//ou ->  list.add(new FuncionarioTercerizado(nome, horas, valorHora, addicionalCharge));
			}else {
				Funcionario terc = new Funcionario(nome, horas, valorHora);
				list.add(terc);
				//ou  -> list.add(new Funcionario(nome, horas, valorHora))
			}
			}
			

			System.out.println("");
			System.out.println("Payments");

			for (Funcionario func : list) {
				System.out.println(func.getName() + " - $" + String.format("%.2f", func.payment()));
			}
		entrada.close();
	}
}
