import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class MultiItemDiscountEngineTest extends TestCase {

	@Test
	public void testForOneItem() {
		String[] items = new String[1];
		items[0] = "bla";
		DiscountEngine d = new MultiItemDiscountEngine();
		DiscountedItem[] discountedItems = d.calculateDiscounts(items);
		DiscountedItem firstItem = discountedItems[0];
		assertTrue(firstItem.getDiscount() == 0);
	}

}
