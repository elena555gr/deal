import java.util.Date;

public class Deal {
	private Date date = new Date();
	private Party seller;
	private Party buyer;
	private Product[] products;
	
	public Date getDate(){
		return date;
	}
	public Party getSeller(){
		return seller;
	}
	public Party getBuyer(){
		return buyer;
	}
	public Product[] getProducts(){
		return products;
	}
	
	public Deal(Party seller, Party buyer, Product[] products){
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		
	}
	
	public double getSum(){
		double rez = 0;
		for (Product pr : products){
			rez += pr.getCost();
		}
		return rez;
	}
	
}


