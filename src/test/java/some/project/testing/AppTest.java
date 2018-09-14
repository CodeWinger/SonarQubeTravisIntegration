package some.project.testing;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {   
    @Test
    public void xLessThan0Test() {
    	new App(-5).get();
    }
    
    @Test
    public void xGreaterThan0Test() {
    	new App(5).get();
    }
    
    @Test
    public void testMain() {
    	App.main(null);
    }
    
}
