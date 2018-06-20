package com.stackroute.exercise1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.stackroute.exercise1.Palindrome;

public class PalindromeTest {
	Palindrome tc;
	@Before
    public void setup(){
        System.out.println("JUnit Call: @Before setUp");
        tc=new Palindrome();
	}

	@Test
	public void test1() {
		String actualvalue=tc.Palin(250); 
		String expectedvalue="Not a Palindrome";
		assertEquals(expectedvalue,actualvalue);
	}
	@Test
	public void test2() {
		String actualvalue=tc.Palin(12321); 
		String expectedvalue="Palindrome and even sum less than 25";
		assertEquals(expectedvalue,actualvalue);
	}
	@Test
	public void test3() {
		String actualvalue=tc.Palin(68486); 
		String expectedvalue="Palindrome and even sum greater than 25";
		assertEquals(expectedvalue,actualvalue);
	}
}

