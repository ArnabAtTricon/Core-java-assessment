import java.io.IOException;
import java.util.*;

public class Customer {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int i=0;
		
		HashMap<Integer, String> custList = new HashMap<Integer, String>();
		HashMap<String,Double> prodList = new HashMap< String,Double>();
		HashMap<String,Double> cart = new HashMap< String,Double>();
		System.out.println("Enter 1 to register");
		System.out.println("Enter 2 to create a product");
		System.out.println("Enter 3 to Create an order");
		System.out.println("Enter 4 to checkout");
		int ch=in.nextInt();
		
		
		switch(ch) {
		
		
		case 1:
			System.out.println("Enter your name");
		    String name = in.nextLine(); 
		    custList.put(i, name);
		    System.out.println("Id="+i+"    password="+name);
		    i++;
		    break;
		    
		    
		case 2:
			
			System.out.println("Enter product name");
			String pname = in.nextLine();
			System.out.println("Enter the product cost");
			double cost=in.nextDouble();
			prodList.put(pname, cost);
			break;
			
		case 3:
			System.out.println("Enter id and password to shop");
			int id=in.nextInt();
			String pass=in.nextLine();
			String var= custList.get(id);
			if(var.equals(pass)) {
				
				for(int j=0;;j++) {
					System.out.println("Enter the product");
					String prod=in.nextLine();
					double price=prodList.get(prod);
					cart.put(prod, price);
					
					System.out.println("Enter 1 to continue shopping");
					int choice=in.nextInt();
					if(choice==1)
						continue;
					break;
					
					
				}
			}
			break;
			
		case 4:
			double total=0.0;
			for(double v:cart.values() )
			total+=v;
			System.out.println("This is your cart total =" +v);
			break;
				
			
			}

		}
		
		
		
	}
	
	
	
	
	public static Register() {
		
		
		
		return
	}
	
	
	public static Product() {
		
	}
	
	public static Order() {
		
	}

}
