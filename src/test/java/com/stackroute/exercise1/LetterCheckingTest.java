package com.stackroute.exercise1;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stackroute.exercise1.LetterChecking;

public class LetterCheckingTest {
	 LetterChecking tc;
	
	@Before
    public void setup(){
        System.out.println("JUnit Call: @Before setUp");
        tc=new LetterChecking();
    }
	@Test
	public void Stringtest() {
		String actualvalue=tc.vowel("Rahul"); 
		String expectedvalue="ConsonantVowelConsonantVowelConsonant";
		assertEquals(expectedvalue,actualvalue);
		
	}
//	void letterCheckingTest() {
//		String 
//	}

}
