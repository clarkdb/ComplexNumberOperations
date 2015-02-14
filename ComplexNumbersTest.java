import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ComplexNumbersTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
	}
	
	
	
	@Test
	public void test() {
		//Addition method tests
		Complex x = new Complex(0,1);
		Complex y = new Complex(-1,0);
		Complex a = new Complex(20000, -25000);
		Complex b = new Complex(-20000, 25000);
		System.out.println(Complex.toString(Complex.complexAdd(x, y)));
		System.out.println(Complex.toString(Complex.complexAdd(a, y)));
		System.out.println(Complex.toString(Complex.complexAdd(x, b)));
		System.out.println(Complex.toString(Complex.complexAdd(a, b)));
		
		//Subtraction method tests
		System.out.println(Complex.toString(Complex.complexSubtract(x, y)));
		System.out.println(Complex.toString(Complex.complexSubtract(a, y)));
		System.out.println(Complex.toString(Complex.complexSubtract(x, b)));
		System.out.println(Complex.toString(Complex.complexSubtract(a, b)));
		
		//Multiplication method tests
		System.out.println(Complex.toString(Complex.complexMultiply(x, y)));
		System.out.println(Complex.toString(Complex.complexMultiply(a, y)));
		System.out.println(Complex.toString(Complex.complexMultiply(x, b)));
		System.out.println(Complex.toString(Complex.complexMultiply(a, b)));
		
		//Division method tests
		System.out.println(Complex.toString(Complex.complexMultiply(x, y)));
		System.out.println(Complex.toString(Complex.complexMultiply(a, y)));
		System.out.println(Complex.toString(Complex.complexMultiply(x, b)));
		System.out.println(Complex.toString(Complex.complexMultiply(a, b)));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	@After
	public void tearDown() throws Exception {
	
	}
	
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

	

	
}
