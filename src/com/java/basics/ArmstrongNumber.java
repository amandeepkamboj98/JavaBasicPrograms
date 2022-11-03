package com.java.basics;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n = 153; 
		int length = 0;
		int t1=n;
		while (t1 != 0) 
		{
			t1 = t1 / 10;
			length = length + 1;
		}
		System.out.println(length);

		   int t2=n;
		   int rem;
		   int arm=0;
		   while(t2!=0)
		   {
			   int mul=1;
			   rem=t2%10;
			   for(int i=1;i<=length;i++)
			   {
				   mul=mul*rem;
			   }
			   arm=arm+mul;
			   t2=t2/10;
			   
		   }
		   if(n==arm)
		   {
			   System.out.println(n+" is a armstrong number");
		   }
		   else
		   {
			   System.out.println(n+" is not armstrong number");
		   }
	}
}
