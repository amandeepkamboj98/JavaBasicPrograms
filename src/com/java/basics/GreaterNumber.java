package com.java.basics;

public class GreaterNumber {

	public static void main(String[] args) {
              int a=100,b=280,c=401;
             
              //greater number between two
             
              if(a>b)          
             {
            	 System.out.println("a is greater");
             }
             else {
            	 System.out.println("b is greater");
             }
              
              
              //greater number between three
            
              if(a>c&&a>b)
              {
            	  System.out.println("a is greater");
              }
             
              else if(b>a&&b>c)
              {
            	  System.out.println("b is greater");
            	  
              }
              else
              {
            	  System.out.println("c is greater");
              }
	}

}
