package dcll.ssli;

import junit.framework.TestCase;

public class ItemTest extends TestCase {

    public void testGetValue() throws Exception {
        Object o = new Object();
        Item item = new Item(o);
        assertEquals(item.getValue(), o);
    }

    public void testSetValue() throws Exception {
        Object o = new Object();
        Item item = new Item(o);
        Object o1 = new Object();
        item.setValue(o1);
        assertEquals(item.getValue(), o1);
    }
}