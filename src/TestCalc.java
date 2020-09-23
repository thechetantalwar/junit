import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestCalc {
    private Calc c;

    @Test
    public void constructorTest(){
        c = new Calc(4, 5);
        assertThat(9, is(c.sum()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorExceptionTest()
    {
        c = new Calc(-4, 5);
    }
}

