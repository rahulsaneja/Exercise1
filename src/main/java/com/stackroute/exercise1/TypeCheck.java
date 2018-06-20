package com.stackroute.exercise1;	
public class TypeCheck {

		public String typeChecking(String str) {
			
			if (str.length()<1 || str.length()>1) {
				return "Invalid length";
			}
		
		      char c=str.charAt(0);
		      if(Character.isDigit(c))
		        return"Digit";
		      else if(Character.isUpperCase(c)) 
		    	  return "Uppercase letter";
		      
		      else  if(Character.isLowerCase(c))
		    	  return "LowerCase letter";
		      else
		    	  return("Special Symbol");
		   
		   }

	}

