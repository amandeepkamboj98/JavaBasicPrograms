package com.java.basics;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n=121,rev=0,rem;
	int	temp=n;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		//System.out.println(rev);
		
		if(n==rev)
		{
		   System.out.println(n+" is a palindrome number");
		   
		}
		else
		{
			System.out.println(n+" not a palindrome number");
		}
	}

}
