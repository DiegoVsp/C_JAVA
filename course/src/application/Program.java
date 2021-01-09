package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);

		Product produto = new Product();

		System.out.println("Enter product data");
		System.out.print("Name: ");
		produto.name = entrada.nextLine();

		System.out.print("Price: ");
		produto.price = entrada.nextDouble();

		System.out.println("Quantity in Stock");
		produto.quantity = entrada.nextInt();

		System.out.println(" ");
		System.out.println("Product data " + produto);

		System.out.println(" ");
		System.out.println("Enter the number  os products to be added in stock");
		int quantity = entrada.nextInt();

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
