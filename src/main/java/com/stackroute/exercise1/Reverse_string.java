package com.stackroute.exercise1;

public class Reverse_string {

	 String reverseString(String str) {
	
	int length = str.length();
	String rever = new String();
	for (int i = length-1;i>=0;i--) {
		char c=str.charAt(i);
	    rever+=c;
	    }
	
	return rever;
  }
	//  public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   String str=sc.next();
//   reverseString(str);
//
}


