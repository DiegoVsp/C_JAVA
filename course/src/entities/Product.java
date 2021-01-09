package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double TotalValueStock() {
		return quantity * price;
	}

	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}

	
	
	public String toString() {
		return name
				+", $ "
				+String.format("%.2f", price)
				+", "
				+quantity
				+" units, Total: $ "
				+String.format("%.2f", TotalValueStock());
	}
}
