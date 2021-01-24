package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//Date
		
		System.out.println("Entre com o nome do departamento: ");
		String departamento = entrada.nextLine();
		
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Name: ");
		String nome = entrada.nextLine();
		System.out.print("Level: ");
		String level = entrada.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = entrada.nextDouble();
		//								instancia de worklevel							obj associado
		Worker trab = new Worker(nome, WorkerLevel.valueOf(level), salarioBase, new Department(departamento));

		System.out.println("Quantos contratos esse trabalhador vai ter? ");
		int n = entrada.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Entre com os dados do #%d contrato%n",i+1);
			System.out.print("Entre com a DATA (DD/MM/YYYY) ");
			
			Date contractDate = sdf.parse(entrada.next()); //Date
			
			System.out.print("Valor por hora: ");
			double valorHora = entrada.nextDouble();
			
			System.out.print("Duração (horas): ");
			int horas = entrada.nextInt();
			
			HourContract contract = new HourContract(contractDate, valorHora, horas);
			//associar trabalhador ao contrato
			trab.addContract(contract);
		}
		System.out.println();
		System.out.println("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
		String monthAndYear = entrada.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.printf("Name: %s%n",trab.getName());
		System.out.printf("Departamento: %s%n",trab.getDepartment().getName());
		System.out.printf("Salario no mês %s: %.2f%n", monthAndYear,trab.income(year, month));

			entrada.close();

	}

}
