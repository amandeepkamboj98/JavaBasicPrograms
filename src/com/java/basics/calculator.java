package com.java.basics;

public class calculator {
	public static void main(String[] args) {
		/*int a=2;
		switch(a)
		{
		case 2:
			System.out.println("value of a:"+a);
			//break;
		case 3:
			System.out.println("value of a:"+a);
		    break;
		default: System.out.println("invalid case");
		}*/
		
		int a=20,b=30,c;
		String sys="+";
		switch(sys) {
		case "+": c=a+b;
		   System.out.println("Addition is: "+c);
		  break;
		case "-": c=a-b;
		   System.out.println("substraction is: "+c);
		  break;
		default: System.out.println("no any symbol");  
		}
	}

}
