package some.project.testing;

/**
 * Hello world!
 *
 */
public class App 
{
	private final int x;
	
	public App(int s) {
		x = s;
	}
	
	public void get() {
		if (x < 0) {
	        System.out.println( "x<0" );
		} else {
	        System.out.println( "x>0" );
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
