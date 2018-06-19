import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class IntegeracceptanceTest {
	Integeracceptance tc;
	@Before
    public void setup(){
        System.out.println("JUnit Call: @Before setUp");
        tc=new Integeracceptance();
    }
	@Test
	public void outOfTomAndJerrytest() {
		String actualvalue=tc.tomAndJerry(250); 
		String expectedvalue="Out of range";
		assertEquals(expectedvalue,actualvalue);
		
	}
	@Test
	public void tomAndJerrytest() {
		String actualvalue=tc.tomAndJerry(24); 
		String expectedvalue="Tom";
		assertEquals(expectedvalue,actualvalue);
		
	}
	@Test
	public void tomAndJerrytestOdd() {
		String actualvalue=tc.tomAndJerry(25); 
		String expectedvalue="Jerry";
		assertEquals(expectedvalue,actualvalue);
		
	}

}
