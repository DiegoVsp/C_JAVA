package entities;

public class CurrentConverter {

	
	public static final double IOF = 0.06;	
	
	public static double EmReais(double qtdDolar, double cotacaoDolar) {
		double vReais = qtdDolar*cotacaoDolar;
		return vReais+(vReais*IOF);
	}
	
}
