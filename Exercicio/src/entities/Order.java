package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	private Cliente client;
	

	public Order() {
		
	}


	public Order(Date moment, OrderStatus status, Cliente client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	public Order(OrderStatus status, Cliente client) {
		this.status = status;
		this.client = client;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public List<OrderItem> getItems() {
		return items;
	}


	//public void setItems(List<OrderItem> items) {
	//	this.items = items;
	//}


	public Cliente getClient() {
		return client;
	}


	public void setClient(Cliente client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	public Double Total() {
		double total = 0;
		for(OrderItem i : items) {
			total+=i.subTotal();
		}
		return total;
	}


	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY: \n");
		sb.append("ORDER Moment: \n");
		sb.append(" "+moment);
		sb.append("Order Status: "+status + "\n");
		sb.append("Cliente"+client.getName()+" ");
		sb.append(sdf.format("( "+client.getBirthDate())+" ) -");
		sb.append(" "+client.getEmail());
		sb.append("\n ");	
		sb.append("Order Items");	
		for(OrderItem i : items) {
			sb.append(i.getProduct().getName()+"\n"+i.getProduct().getPrice());
		}
		return sb.toString(); // Convertendo StringBuilder para string
	}
	
	
}
