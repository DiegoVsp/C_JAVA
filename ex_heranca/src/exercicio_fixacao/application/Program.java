package exercicio_fixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio_fixacao.entities.ImportedProduct;
import exercicio_fixacao.entities.Product;
import exercicio_fixacao.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Entre com o número de Produtos: ");
		int n = entrada.nextInt();
		
		for(int i = 0 ; i< n; i++) {
			System.out.println("Common, used or imported (c/u/i)? ");
			char ch = entrada.next().charAt(0);
			
			System.out.print("Name:");
			entrada.nextLine();
			String nome = entrada.nextLine();
			
			System.out.print("Price:");
			double price = entrada.nextDouble();
			
			if(ch == 'i') {
				System.out.println("Custom fee: ");
				double customFee = entrada.nextDouble();
				
				
				Product product = new ImportedProduct(nome, price, customFee);
				
				list.add(product);
				
			}else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(entrada.next());
				Product product = new UsedProduct(nome, price, manufactureDate);
				list.add(product);
			}else {
				Product product = new Product(nome, price);
				list.add(product);
			}
		}
		System.out.println("Price Tags: ");
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		entrada.close();
	}
}
