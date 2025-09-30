
public class Products {
	
	private int id;
	private String name;
	private String price;
	private String details;
	
	public Product (int id, String name, String price, String details) {
		this.id= id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void createProduct() {
		
	}
	
	public void updateProduct() {
		if(name != null) this.name = name;
		if(price>0) this.price = price;
		if(quantity>0) this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		return Product {"id=" + id + ", name = " + name + "price" + price}
	}

}

