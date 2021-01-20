package Listas.exercicios;

public class Func {

	private String nome;
	private int id;
	private double salario;

	public Func() {

	}

	public Func(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentoSalario(double percentage) {
		salario += salario * percentage / 100;
	}
	
	@Override
	public String toString() {
		return "Funcionario id:" + id + ", " + nome + ", R$" + String.format("%.2f", salario);
	}

}
