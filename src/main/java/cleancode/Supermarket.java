package cleancode;

import java.util.HashMap;

public class Supermarket {
	
		public static void main(String args[]){
			
			HashMap<String , Integer> product = new HashMap<String, Integer>();
			addNewproduct();
		
			
		}
		     private static void getProduct(String productName) {
			
		    	 HashMap<String , Integer> product = new HashMap<String, Integer>();
		    	 System.out.println(product.get(productName));
				
			
		}
			private static void addNewproduct() {
			
		    	 HashMap<String , Integer> product = new HashMap<String, Integer>();
		         product.put("Groocery" , 12000);
			   	 product.put("Vegetables" , 1000);
		     }

		
		   
		
	}	


