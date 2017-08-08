package com.radha;

public class Strrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="stress";
       int i=0,j=0,n=0,loc=0;
       char num,num1;
       boolean flag=true;
       n=str.length();
    loop:   for(i=0;i<n;i++)
       {num=str.charAt(i);
        loc=i;
       loop1:  for (j=0;j<n;j++)
         {
        	 num1=str.charAt(j);
        	 if ((num1==num) &&(j!=loc))
        	 {flag=false;
        	 System.out.println("radha iam in the loop"+num+num1+loc+j);
        	 break loop1;}
        	 else{
        		 flag=true;
        		 continue loop1;}
         }
          if (flag==true)
          {System.out.println("first non repeatable character is"+num);
          break loop;}
         
    	   
    	   
       }
    	   
	}

}
