package exemplos_enum;

import java.util.Date;
import java.util.Locale;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		//ENUM
		Locale.setDefault(Locale.US);
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENTS);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(order);
		System.out.println(os1);
		System.out.println(os2);
	}

}
