/**
 * Test if you can use a null reference to find a static method.
 * @author Ian F. Darwin, ian@darwinsys.com
 * @version $Id$
 */
public class NullStaticMethod {
	public static void main(String[] argv) {
		System.out.println("XXX ");
		NullStaticMethod2 x = null;
		x.invoke();
	}
}
