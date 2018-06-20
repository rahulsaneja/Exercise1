package com.stackroute.exercise1;


public class NIterations {

	public String iteration(int x) {
		String str="";
		if(x==0)
			return "Not in range";
		for(int i= 1; i<=x; i++)
			for(int j = 1; j<=i; j++) {
				str=str+i;
			}
		return str;
	}

}
