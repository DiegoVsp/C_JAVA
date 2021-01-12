package constructor.application;

import java.util.Locale;
import java.util.Scanner;

import constructor.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);


		System.out.println("Enter product data");
		System.out.print("Name: ");
		String name = entrada.nextLine();

		System.out.print("Price: ");
		double price = entrada.nextDouble();

		System.out.println("Quantity in Stock");
		int quantity = entrada.nextInt();
		
		Product produto = new Product(name, price, quantity);

		System.out.println(" ");
		System.out.println("Product data " + produto);

		System.out.println(" ");
		System.out.println("Enter the number  os products to be added in stock");
		quantity = entrada.nextInt();

		produto.AddProducts(quantity);

		System.out.println("Updated data " + produto);

		System.out.println(" ");
		System.out.println("Enter the number  os products to be removed from stock");
		quantity = entrada.nextInt();

		produto.RemoveProduct(quantity);
		
		System.out.println("Updated data " + produto);
		
		entrada.close();

	}

}
