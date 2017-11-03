import java.util.Scanner;

public class Main {
	String itemArray [];
	//assume the list is what we use
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		Main main = new Main();
		while(!input.equalsIgnoreCase("1")){
			main.displayMainMenu();
			Scanner scanner = new Scanner(System. in); 
			input = scanner. nextLine();
			if(input.equals("0")){
				System.out.println("Enter list of items: ");;
				input = scanner. nextLine();
				main.addItemViaString(input);
				System.out.println("------------------------------------");;
				main.displayAllItem();
			}
		}
	}
	
	public void displayMainMenu(){
		System.out.println("------------------------------------");;
		System.out.println("0 - enter order");;
		System.out.println("1 - exit system");;
		System.out.println("Input choice:");;
	}
	
	
	
	public void displayAllItem(){
		ProductCatalogue  catalogue = new ProductCatalogue();
		MultiItemDiscountEngine engine = new MultiItemDiscountEngine();
		DiscountedItem discountedItems [] = engine.calculateDiscounts(itemArray);
		System.out.println("Receipt:=======================");
		for(int i = 0 ; i < itemArray.length; i++ )
		{
			System.out.println(itemArray[i]+"|"+catalogue.getPrice(itemArray[i])+"|"+discountedItems[i].getFinalPrice()+"|"+discountedItems[i].getDiscount()+"%");
		}
		System.out.println("=======================");
		
	}
	
	public String[] addItemViaString(String itemList){
		itemArray  = itemList.split(" ");
		for(int i = 0 ; i < itemArray.length; i++ )
		{
			System.out.println(itemArray[i]);
		}
		
		return itemArray;
	}

}

