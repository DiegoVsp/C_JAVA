package entities;

public class SavingAccount extends Account {
	private Double interestRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
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
