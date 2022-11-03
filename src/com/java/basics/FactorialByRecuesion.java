package com.java.basics;

public class FactorialByRecuesion {
	   int fact=1;
	
public int calFact(int n){
		if(n>1)
		{
				fact=fact*n;
		     calFact(n-1);
		}
		return fact;   
	   }

   public static void main(String[] args) {
	int n=6,res;
	FactorialByRecuesion f=new FactorialByRecuesion();
	//res=f.calFact(n);
	
	System.out.println(f.calFact(n));
	
}
}
