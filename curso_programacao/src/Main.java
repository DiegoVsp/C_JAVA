import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		
		//configurar Localiza��o do nosso programa
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		
		System.out.println("Resultado � = "+x+" METROS");
		System.out.printf("O resultado � = %.2f METROS%n",x);
		
		System.out.printf("%s tem %d anos e sua renda � de %.2f%n",nome,idade,renda);
	}

}
