package com.radha;

public class Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=658;
		Rec rec=new Rec();
      int ans=rec.sum(num);
      System.out.println("num is the"+ans);
	}
	public int sum(int n)
	{
		int res=0;
		int i=0,j=0;
		if (n==0)
		{res=res;
		}
		else{
			
			i=n %10;
			  n=n/10;
			  res=res+i+sum(n);
		}
		
	  return res;
	}
	

}
