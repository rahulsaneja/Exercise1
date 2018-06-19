import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
	Palindrome tc;
	@Before
    public void setup(){
        System.out.println("JUnit Call: @Before setUp");
        tc=new Palindrome();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
