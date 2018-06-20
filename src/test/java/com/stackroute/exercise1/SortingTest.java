package com.stackroute.exercise1;

import static org.junit.Assert.*;

import java.util.ArrayList;


import org.junit.Before;
import org.junit.Test;

public class SortingTest {
    
    Sorting s = new Sorting();
    @Before
    public void setUp() throws Exception {
    }
    
    @Test
    public void testsortNumber() {
        ArrayList <Integer> actual = new ArrayList<Integer>();  
        actual = s.sortNumber(223);
        ArrayList <Integer> expected = new ArrayList<Integer>(){{
            add(3);
            add(2);
            add(2);
        }};
        assertTrue(actual.equals(expected));        
    }
    
    @Test
    public void testsumOfEven() {
        int actual = s.sumOfEven(223);
        assertEquals(4,actual);
    }

}
