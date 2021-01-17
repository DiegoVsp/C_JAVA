package exer_fixacao.entities;

public class Account {
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder, double initialDeposit) {

		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); // se a regra de deposito mudar, vai ser mudado do metodo deposito e o
									// construtor já vai estar pronto
	}

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	// gerar somente o getBalance. Ele só pode ser alterado a partir do método
	// deposito ou saque

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount; // encapsulando a regra de negócio relativo a depósito dentro desse
								// método(deposit)
	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount - 5.00;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $" + String.format("%.2f", balance);
	}

}
