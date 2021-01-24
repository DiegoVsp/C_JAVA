package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ProgramaItem {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Cliente: ");
		System.out.print("Name: ");
		String name = entrada.nextLine();
		
		System.out.print("E-mail: ");
		String email = entrada.nextLine();
		
		System.out.print("Data Nascimento (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(entrada.nextLine());
		
		Cliente cliente = new Cliente(name, email, birthDate);
		
		System.out.println("Insira o status do pedido");
		System.out.print("Status: ");
		String status = entrada.nextLine();
		
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), cliente);
		//Order order = new Order(new Date(), OrderStatus.valueOf(status), new Cliente(name, email, birthDate));
			
		System.out.println("How many items to this order? ");
		int n = entrada.nextInt();
		for(int i = 0; i< n;i++) {
			System.out.println("");
			System.out.printf("Entre com o #%d item\n",(i+1));
			System.out.print("Product name: ");
			entrada.nextLine();
			String productName = entrada.nextLine();
			System.out.println("Product price: ");
			double productPrice = entrada.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = entrada.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem item = new OrderItem(quantidade, productPrice, product);
			//OrderItem item = new OrderItem(quantidade, productPrice, new Product(productName, productPrice));
			
			
			order.addItem(item);			
			
		}
		System.out.println(order);
		
		entrada.close();
	}
}
