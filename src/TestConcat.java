import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConcat {
    @Test
    public void testSuccessMethod(){
        Concat c =new Concat();
        String result = c.concat("Hello ","World");
        assertEquals("Hello World",result);
    }
    @Test
    public void testEmptyString(){
        Concat c =new Concat();
        String result = c.concat("","");
        assertEquals(" ",result);
    }
}
