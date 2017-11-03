import java.util.HashMap;
import java.util.Map;

public class ProductCatalogue {
	
	Map<String, Float> map = null;
	
	public ProductCatalogue () {
		map = new HashMap<String, Float>();
		map.put("A", 10.0f);
		map.put("B", 15.0f);
		map.put("C", 20.0f);
	}
	
	public float getPrice(String productCode) {
		return map.get(productCode);
	}

}
