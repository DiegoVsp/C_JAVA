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
	
	@Override //sobreposição
	public final void withdraw(double amount) { 
		balance-=amount;
	}
	//convém acrescentar  final em métodos sobrepostos,
	//pois sobreposições multiplas podem ser uma porta de entrada para inconsistências.
}
