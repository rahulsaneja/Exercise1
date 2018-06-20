package com.stackroute.exercise1;


public class Integeracceptance {
	 String tomAndJerry(int num)  {
		         
			     if(num>20 && num<30) {
			    	 if(num%2==0) {
			    		 return "Tom";
			    	 }
			    	 else {
			    		 return "Jerry";
			    	 }
			     }
			     else {
			    	 return "Out of range";
			     }
		}
}