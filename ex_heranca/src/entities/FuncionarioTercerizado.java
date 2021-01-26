package entities;

public class FuncionarioTercerizado extends Funcionario {

	private Double additionalCharge;

	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {//Polimosrfismo
		return super.payment() + additionalCharge * 1.1;
	}

}
