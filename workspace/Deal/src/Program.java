import java.util.Scanner;


public class Program {
	private static final int MAX_PRODUCTS = 2;
	private static final int MAX_DEALS = 2;
	private Deal[] deals;
	
	private void input(){
		deals = new Deal[MAX_DEALS];
		for (int i=0;i<deals.length;i++){
			System.out.println((i+1) + "of" +deals.length + ":");
			deals[i] = inputDeal();
		}
	}
	
	private Deal inputDeal() {
		// TODO Auto-generated method stub
		System.out.println("Input Deal data->");
		
		System.out.println("Input sellar");
		Party seller = inputParty();
		
		System.out.println("Input buyer");
		Party buyer = inputParty();
		
		Product[] products = new Product[MAX_PRODUCTS];
		for (int i=0; i<products.length;i++){
			products[i] = inputProduct();
		}
		Deal deal = new Deal(buyer, seller, products);
		
		return deal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program().allActions();
		
	}
	
	private void allActions() {
		// TODO Auto-generated method stub
		input();
		System.out.println("========================");
		output();
	}

	private String keyboard(String message) { 
	     System.out.print(message + ": "); 
	     Scanner scan = new Scanner(System.in); 
	     return scan.next();
	}
	
	private Party inputParty(){
		String partyName = keyboard("Party name");
		Party party = new Party();
		party.setName(partyName);
		return party;
		
		
	}
	
	private Product inputProduct(){
		System.out.println("Input product ->");
		String title = keyboard("    title");
		String priceStr = keyboard("  price");
		String quantityStr = keyboard("   quantity");
		Product product = new Product();
		product.setTitle(title);
		product.setPrice(Double.valueOf(priceStr));
		product.setQuantity(Integer.valueOf(quantityStr));
		
		return product;
	}
	
	private void output(){
	for (Deal d:deals){
		System.out.println("Deal "+ d.getDate());
		System.out.println(d.getBuyer().getName() + " buys from " + d.getSeller().getName());
		for (Product product : d.getProducts()){
			System.out.println("    "+ product.getTitle()+ " " + product.getPrice() + " " + product.getCost());
			
		}
        System.out.println("sum =  "+ d.getSum());
	}


	}
}
