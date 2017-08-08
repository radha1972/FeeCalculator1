package com.radha;

public class Strrevrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="Radha";
     Strrevrec rev= new Strrevrec();
      String res= rev.rev(str);
      System.out.println("Radha reverse is"+res);
     
	}
	
	public String rev(String str)
	{ String temp="",str1="";
	char x=' ';
	 int i=str.length();
	 int n=i-1;
	 x=str.charAt(n);
	 if(n==0)
	 {temp=temp+str.charAt(n);}
	 else{
	 for(int j=0;j<n;j++)
	 { str1=str1+str.charAt(j);}
	 str=str1;
	 
	 temp=x+rev(str);
	 }
		
		return temp;}

}
