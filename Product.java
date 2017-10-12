
public class Product {
	private String title;
	private double price;
	private int quantity;
 
	public void setTitle(String titleVal){
		this.title = titleVal; 
	}
	public void setPrice(double priceVal){
		this.price = priceVal; 
	}
	public void setQuantity(int quantityVal){
		this.quantity = quantityVal; 
	}
	
	
	public String getTitle(){
		return title;
	}
	public double getPrice(){
		return price;
	}
	public int getQuantity(){
		return quantity;
	}
	public double getCost(){
		return quantity*price;
	}
	
	
	
}
