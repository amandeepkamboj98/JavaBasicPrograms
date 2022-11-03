package com.java.basics;

   class Program2{

		   public int[] multiple(int a, int b)
		{
		int[] opr=new int[2];
		opr[0]= a+b;
		opr[1]=a*b;
		System.out.println(opr[0]);
		System.out.println(opr[1]);
		return opr;
		    }
		}
		 class Program{
		    public static void main(String args[]) {
		       Program2 ob=new Program2();
		        ob.multiple(15,10);
		     }	
	   }




