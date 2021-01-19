package Listas.exer_proposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int n = entrada.nextInt();
		entrada.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d:%n", i + 1);
			System.out.print("Id: ");
			Integer id = entrada.nextInt();
			
			
			while(hasId(list, id)) {
				System.out.println("This id already taken! please try again: ");
				id=entrada.nextInt();
			}

			System.out.print("Name: ");
			entrada.nextLine();
			String nome = entrada.nextLine();

			System.out.print("Salary: ");
			Double salario = entrada.nextDouble();

			Funcionario emp = new Funcionario(id, nome, salario);

			list.add(emp);
		}
		System.out.println("");
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = entrada.nextInt();
		Funcionario emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		// Integer pos = position(list, idSalary);

		if (emp == null) {
			System.out.println("This id does not exist");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = entrada.nextDouble();
			emp.aumentoSalario(percent);
			// list.get(pos).aumentoSalario(percent);
		}
		System.out.println();
		System.out.println("List of Employees: ");
		for (Funcionario x : list) {
			System.out.println(x);
		}

		entrada.close();
	}

	// com tipo Integer pode obter o retorno = null
	// Caso int o retorno seria -1
	public static Integer position(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	public static boolean hasId(List<Funcionario> list,int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
