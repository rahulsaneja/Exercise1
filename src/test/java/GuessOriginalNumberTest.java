import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GuessOriginalNumberTest {
	GuessOriginalNumber tc;
	@Before
    public void setup(){
        System.out.println("JUnit Call: @Before setUp");
        tc=new GuessOriginalNumber();
	}
	@Test
	public void outOfCheckNumbertest() {
		String actualvalue=tc.checkNumber(400,45); 
		String expectedvalue="invalid number";
		assertEquals(expectedvalue,actualvalue);
		
	}
	@Test
	public void CheckNumbertest() {
		String actualvalue=tc.checkNumber(29,45); 
		String expectedvalue="Number guessed is less than original number";
		assertEquals(expectedvalue,actualvalue);
	}
	@Test
	public void NumbertestGreater() {
		String actualvalue=tc.checkNumber(49,45); 
		String expectedvalue="Number guessed is more than original number";
		assertEquals(expectedvalue,actualvalue);
	}
	@Test
	public void NumbertestLesser() {
		String actualvalue=tc.checkNumber(45,45); 
		String expectedvalue="Number guessed matches the original number";
		assertEquals(expectedvalue,actualvalue);
	}
}

