package com.stackroute.exercise1;


public class GuessOriginalNumber {
	public String checkNumber(int userNum, int targetNum) {
	
		if(userNum>1 && userNum<50) {
				if(userNum>targetNum) {
					return "Number guessed is more than original number";
				}else if (userNum<targetNum) {
					return "Number guessed is less than original number";
				}else {
					return "Number guessed matches the original number";
				}
			}
			else {
				
					return "invalid number";
			
					}
			}
//	public static void main(String[] args) {
//		GuessOriginalNumber gn=new GuessOriginalNumber();
//		System.out.println(gn.checkNumber(400, 44));
//	}
	
}
