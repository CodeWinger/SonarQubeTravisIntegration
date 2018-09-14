package some.project.testing;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{   
    @Test
    public void xLessThan0Test() {
    	new App(-5).get();
    }
    
    @Test
    public void xGreaterThan0Test() {
    	new App(5).get();
    }
    
}
