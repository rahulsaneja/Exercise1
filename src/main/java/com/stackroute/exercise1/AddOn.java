package com.stackroute.exercise1;


public class AddOn {
	public String addition(String str) {
	      
		int length = str.length();
	       String arr[];
	       arr=str.split(" ");
	       if(length == 0) {
	    	   return "Please enter some number";
	       }
	       if (arr.length == 1) {
	    	   return "Sum is same as the number";
	       }
	       int sum =0;
	       
	      
	       for(int i=0;i<arr.length;i++)
	       { 
	           try
	           {int num = Integer.parseInt(arr[i]);
	    	   sum=sum+num;
	          }
	           catch(NumberFormatException e)
	           {
	        	   return "Invalid input";
	           }
	       }
	       String retSum=sum+"";
	      return retSum;
		}
}
