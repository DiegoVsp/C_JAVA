package entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double taxa;

	public double NetSalary() {
		return salarioBruto - taxa;
	}

	public void IncreaseSalary(double percent) {
		salarioBruto += salarioBruto * percent / 100.0;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", NetSalary());
	}
}
