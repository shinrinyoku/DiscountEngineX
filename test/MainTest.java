
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class MainTest extends TestCase {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	public void testAddItemViaStringList(){
		
		String itemList = "A A A B B";
		Main main = new Main();
		String items[]=main.addItemViaString(itemList);
		assertEquals(5,items.length);
		
	}

}
