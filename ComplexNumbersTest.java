import static org.junit.Assert.*;

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
		fail("Not yet implemented");
		//Add method tests
		Complex x = new Complex(0,1);
		Complex y = new Complex(-1,0);
		System.out.println(Complex.toString(Complex.complexAdd(x, y)));
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	@After
	public void tearDown() throws Exception {
	
	}
	
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

	

	
}
