
public class MultiItemDiscountEngine extends DiscountEngine {

	public MultiItemDiscountEngine() {
		// TODO Auto-generated constructor stub
	}
	
	public DiscountedItem[] calculateDiscounts(String[] items) {
		int numOfItems = items.length;
		DiscountedItem[] result = new DiscountedItem[numOfItems];
		for(int i = 0; i < numOfItems; i++) {
			result[i] = new DiscountedItem(items[i], 0, 0);
		}
		
		
//		if(numOfItems == 1) {
//			result[0].setD
//			result[0] = new DiscountedItem(items[0], 0, 0);
//			return result;
//		}
		
		
		
		if(numOfItems == 2) {
			if(items[0].equals(items[1])) {
				result[1].setDiscount(30);
			}
		}
		
		return result;
	}

}
