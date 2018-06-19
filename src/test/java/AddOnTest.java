import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddOnTest {
	AddOn tc;
	@Before
    public void setup(){
        System.out.println("JUnit Call: @Before setUp");
        tc=new AddOn();
	}
	@Test
public void NoInput() {
	String actualvalue=tc.addition(""); 
	String expectedvalue="Please enter some number";
	assertEquals(expectedvalue,actualvalue);
	}
	@Test
	public void singleInput() {
		String actualvalue=tc.addition("47"); 
		String expectedvalue="Sum is same as the number";
		assertEquals(expectedvalue,actualvalue);
		}
	@Test
	public void StringInputWithChar() {
		String actualvalue=tc.addition("47a 56b c"); 
		String expectedvalue="Invalid input";
		assertEquals(expectedvalue,actualvalue);
		}
	@Test
	public void StringInputWithNum() {
		String actualvalue=tc.addition("47 56 21"); 
		String expectedvalue="124";
		assertEquals(expectedvalue,actualvalue);
		}
}