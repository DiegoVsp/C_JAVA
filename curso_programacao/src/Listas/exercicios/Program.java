package Listas.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Exercicio Lista2
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		List<Func> list = new ArrayList<>();

		System.out.println("Quantos empregados deseja cadastrar?");
		int n = entrada.nextInt();
		entrada.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.printf("#%d%n", (i + 1));
			System.out.print("Id: ");
			int id = entrada.nextInt();

			while(hasId(list,id)) {
				System.out.println("Este Id já está em uso!Escolha outro");
				id = entrada.nextInt();
			}
			
			System.out.print("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();

			System.out.print("Salario: ");
			double salario = entrada.nextDouble();

			Func empregado = new Func(id, nome, salario);

			list.add(empregado);
		}
		System.out.println("Entre com o id do funcionário");
		int idSalary = entrada.nextInt();
		Integer pos = position(list, idSalary);

		if (pos == null) {
			System.out.println("Esse id não existe");
		} else {
			System.out.println("Entre com a porcentage:");
			double porc = entrada.nextDouble();
			list.get(pos).aumentoSalario(porc);
		}

		for (Func x : list) {
			System.out.println(x);
		}

		entrada.close();
	}

	public static Integer position(List<Func> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Func> list, int id) {
		Func emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
