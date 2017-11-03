
public class MultiItemDiscountEngine extends DiscountEngine {

	public MultiItemDiscountEngine() {
		// TODO Auto-generated constructor stub
	}
	
	public DiscountedItem[] calculateDiscounts(String[] items) {
		if(items.length == 1) {
			DiscountedItem[] result = new DiscountedItem[1];
			result[0] = new DiscountedItem(items[0], 0, 0);
			return result;
		}
		DiscountedItem[] result = new DiscountedItem[0];
		return result;
	}

}
