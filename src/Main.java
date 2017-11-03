
public class Main {
	//assume the list is what we use
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String[] addItemViaString(String itemList){
		String itemArray [] = itemList.split(" ");
		for(int i = 0 ; i < itemArray.length; i++ )
		{
			System.out.println(itemArray[i]);
		}
		
		return itemArray;
	}

}
