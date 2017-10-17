package hello;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ggikko on 2017. 10. 17..
 */
public class HelloGgikkoTest {
    private HelloGgikko helloGgikko;

    @Before
    public void setup() {
        helloGgikko = new HelloGgikko();
    }

    @Test
    public void testGetMessage() {
        assertEquals("Hello World!", helloGgikko.getMessage(false));
    }
}
