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
	
	@Test
	public void testForTwoSimilarItems() {
		String[] items = new String[2];
		items[0] = "hello";
		items[1] = "hello";
		DiscountEngine d = new MultiItemDiscountEngine();
		DiscountedItem[] discountedItems = d.calculateDiscounts(items);
		DiscountedItem firstItem = discountedItems[0];
		DiscountedItem secondItem = discountedItems[1];
		assertTrue(firstItem.getDiscount() == 0);
		assertTrue(secondItem.getDiscount() == 30);
	}
	
	@Test
	public void testForTwoDifferentItems() {
		String[] items = new String[2];
		items[0] = "hello";
		items[1] = "hallo";
		DiscountEngine d = new MultiItemDiscountEngine();
		DiscountedItem[] discountedItems = d.calculateDiscounts(items);
		DiscountedItem firstItem = discountedItems[0];
		DiscountedItem secondItem = discountedItems[1];
		assertTrue(firstItem.getDiscount() == 0);
		assertTrue(secondItem.getDiscount() == 0);
	}

}
