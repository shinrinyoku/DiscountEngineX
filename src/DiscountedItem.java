
public class DiscountedItem {

	private String _item;
	private float _discount;
	private float _finalPrice;
	
	public DiscountedItem(String item, float discount, float finalPrice) {
		_item = item;
		_discount = discount;
		_finalPrice = finalPrice;
	}
	
	public String getItem(){
		return _item;
	}
	
	public void setItem(String item){
		_item = item;
	}
	
	public float getDiscount(){
		return _discount;
	}
	
	public void setDiscount(float discount){
		_discount = discount;
	}
	
	public void setFinalPrice(float finalPrice) {
		_finalPrice = finalPrice;
	}
	
	public float getFinalPrice() {
		return _finalPrice;
	}
}
