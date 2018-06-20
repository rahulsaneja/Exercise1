package com.stackroute.exercise1;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TypeCheckTest {
TypeCheck tc;
	
	@Before
    public void setup(){
        System.out.println("JUnit Call: @Before setUp");
        tc=new TypeCheck ();
    }
	@Test
    public void test() {
        
         String ret=tc.typeChecking("aa");
         assertEquals("Invalid length",ret);
    }
    @Test
    public void test1() {
        
         String ret=tc.typeChecking("");
         assertEquals("Invalid length",ret);
    }
    @Test
    public void test2() {
        
         String ret=tc.typeChecking("a");
         assertEquals("LowerCase letter",ret);
    }
    @Test
    public void test3() {
       
         String ret=tc.typeChecking("A");
         assertEquals("Uppercase letter",ret);
    }
    @Test
    public void test4() {
        
         String ret=tc.typeChecking("8");
         assertEquals("Digit",ret);
    }
    @Test
    public void test5() {
       
         String ret=tc.typeChecking("@");
         assertEquals("Special Symbol",ret);
    }

}



