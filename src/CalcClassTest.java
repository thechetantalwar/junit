import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalcClassTest {
    private CalcClass c;

    @Test
    public void constructorTest(){
        c = new CalcClass(6,7);
        assertEquals(13,c.sum());
        //assertThat(13,is(c.sum()));
    }
    @Test(expected = IllegalArgumentException.class)
    public void constructorTestForException() {
        c = new CalcClass(4,-6);
    }
}
