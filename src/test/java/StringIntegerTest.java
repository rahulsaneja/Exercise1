import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringIntegerTest {
	StringInteger tc;
	@Before
    public void setup(){
        System.out.println("JUnit Call: @Before setUp");
        tc=new StringInteger();
    }
@Test
public void invalidInteger() {
	String actualvalue=tc.stack(0 ,"stackroute"); 
	String expectedvalue="Enter a number greater than 0";
	assertEquals(expectedvalue,actualvalue);
	
}
@Test
public void integerLargerThanLength() {
	String actualvalue=tc.stack(12 ,"stackroute"); 
	String expectedvalue="Input cannot be greater than length";
	assertEquals(expectedvalue,actualvalue);
	
}@Test
public void value() {
	String actualvalue=tc.stack(2 ,"stackroute"); 
	String expectedvalue="stackroutetete";
	assertEquals(expectedvalue,actualvalue);
	
}
@Test
public void novalue() {
	String actualvalue=tc.stack(6,""); 
	String expectedvalue="Enter a string";
	assertEquals(expectedvalue,actualvalue);
	
}
}	