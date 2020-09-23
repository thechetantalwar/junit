import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class VoidMethodTest {
    private VoidMethodClass users =new VoidMethodClass();

    @Before
    public void init(){
        users.addUser("Chetan");
        users.addUser("Sachin");
        users.addUser("Rahul");
    }
    @Test
    public void testingremoveAll()
    {
        users.removeAll();
        assertEquals(0,users.size());
    }
    @Test
    public void testingSizeMethod(){
        assertEquals(3,users.size());
    }
    @Test
    public void testingAddMethod(){
        users.addUser("Rohit");
        assertEquals(4,users.size());
    }
    @Test
    public void testingRemoveMethod(){
        users.removeUser("Chetan");
        assertEquals(2,users.size());
    }
    @Test(expected = NoSuchElementException.class)
    public void testingRemoveMethodForException(){
        users.removeUser("Chirag");
        assertEquals(2,users.size());
    }
    @After
    public void destroy(){
        users.removeAll();
    }
}
