package com.radha;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,temp=0;
        int y=1;
        int n=20;
        int i=0;
System.out.println("the values in fibonacci series is");
    for (i=0;i<=n;i++)
       {

       System.out.println("radha"+x);
        temp=x;
        x=y;
        y=x+temp;
	}

}}
