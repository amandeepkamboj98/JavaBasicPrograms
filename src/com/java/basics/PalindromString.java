package com.java.basics;

public class PalindromString {
	public static void main(String[] args) {
		String name =  "madam";
		int leng=name.length();
		String rev = "";
		for (int i =leng - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		if (name.equals(rev))
		{
			System.out.println("palindrome String");
		} 
		else
		{
			System.out.println("not palindrome string");
		}
	}
}
