package constructor.exercicios;

public class Conta {

	private final float TAXA = 5.00f;

	private int accountNumber;
	private String titular;
	private double valor;

	
	public Conta(int accountNumber, String titular) {
		this.accountNumber = accountNumber;
		this.titular = titular;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void deposito(double valor) {
		this.valor += valor;
	}

	public void saque(double valor) {
		this.valor = this.valor - valor - TAXA;
	}

	public String toString() {
		return  "Account "+ accountNumber + ", Holder: " + titular + ", Balance: $" + String.format("%.2f", valor) ;
	}

}
