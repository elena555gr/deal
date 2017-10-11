import java.util.Scanner;

public class Program {
	
	private Deal[] deals = new Deal[10];
	int tail = 0;
	private String Keyboard(String message) { 
	     System.out.print(message + ": "); 
	     Scanner scan = new Scanner(System.in); 
	     String rez = scan.next(); 
	     scan.close(); 
	     return rez; 
	}
	
	public void inputParty(){
		String sellerName = Keyboard("Seller name");
		String buyerName = Keyboard("Buyer name");
		
		Party par = new Party();
		par.setName(sellerName);
		par.setName(buyerName);
	}
	
	public void inputProduct(){
		String title = Keyboard("title");
		String priceStr = Keyboard("price");
		String quantityStr = Keyboard("quantity");
		
		Product pr = new Product();
		pr.setTitle(title);
		pr.setPrice(Double.valueOf(priceStr));
		pr.setQuantity(Integer.valueOf(quantityStr));
	}
	
	
	
	
     
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("");
	}

}
