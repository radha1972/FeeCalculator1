package com.radha;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] num={3,7,8,5,2,1,9,5,4};
   int i=0,j=0,k=0,n=0,temp=0;
   
   n=num.length;
   for(i=0;i<n;i++)
   {for (j=i+1;j<n;j++)
   {if (num[i]>num[j])
   {temp=num[i];
   num[i]=num[j];
   num[j]=temp;}
   }
	   }
	
 System.out.println("the numbers after sorting are");
 for( i=0;i<n;i++)
 {System.out.println(num[i]);}
 
}}
