package com.stackroute.exercise1;
public class Palindrome {

        public static String Palin(int num)
        {
     
        int val=num;
       
        String x=Integer.toString(num);
        int len=x.length();
       
        if(len==0||len==1)
            return("Same");
       
       
        int i;
        int k=0;
        int arr[];
        arr=new int[len];
        int evensum=0;
        while(num>0)
        {
             i=num%10;
             if(i%2==0)
               evensum+=i;
           
              arr[k++]=i;
                num=num/10;
        }
      int rev = 0;
      for(int j=0;j<len;j++)
      {
          rev = rev * 10 + arr[j];
      }
  if(val!=rev)
       return("Not a Palindrome");
  else if(val==rev && evensum<25) 
       return("Palindrome and even sum less than 25");
  else 
       return("Palindrome and even sum greater than 25");
    
}}