package ex_classe_abstrata.entities;


public class SavingsAccount extends Account {
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override //sobreposi��o
	public final void withdraw(double amount) { 
		balance-=amount;
	}
	//conv�m acrescentar  final em m�todos sobrepostos,
	//pois sobreposi��es multiplas podem ser uma porta de entrada para inconsist�ncias.
}
