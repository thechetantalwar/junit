import org.junit.*;


import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class TestMyList {
    private MyList lstTest = new MyList();

    @Before
    public void init() {
        lstTest.add("Apple");
        lstTest.add("Orange");
        lstTest.add("Grapes");
    }

    @Test
    public void testSize() {
        assertEquals("Checking size of List", 3, lstTest.size());
    }

    @Test
    public void testAdd() {
        lstTest.add("Banana");
        assertEquals("Adding 1 more fruit to list", 4, lstTest.size());
    }

    @Test
    public void testRemove() {
        lstTest.remove("Orange");
        assertEquals("Removing 1 fruit from list", 2, lstTest.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveException() {
        lstTest.remove("Kiwi");
        assertEquals("Removing 1 fruit from list", 2, lstTest.size());
    }

    @After
    public void destroy() {
        lstTest.removeAll();
    }
}
