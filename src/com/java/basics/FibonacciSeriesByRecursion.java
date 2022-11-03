package com.java.basics;

public class FibonacciSeriesByRecursion {
		int a=0,b=1,c;
		public static void main(String[] args) {
			FibonacciSeriesByRecursion f=new FibonacciSeriesByRecursion();
			f.show(10);
		}
		void show(int n)
		{
			if(n>=1) {
				c=a+b;
			System.out.println(c);
			  a=b;
			  b=c;
			show(n-1);
			
		}

}
}