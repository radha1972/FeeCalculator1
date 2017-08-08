package com.radha;

public class Strnum
{

  public static void main(String args[])
  {
    String str= args[0];
    int sum=0;
    int n1=0;
     int n=1;
      int cnt=0;
      char c='\n';
      int cnt1=0;

    System.out.println("Enter the string to convert to number");
    
    int i =str.length();
   while (i>0 )
    {
     c=str.charAt(i-1);
    n1=  Character.getNumericValue(c);
     
     System.out.println(" n1 =" +n1);
     
      cnt1=cnt;
      while (cnt1>0)
      { n=n*10; 
        cnt1--;
      
      }
      System.out.println("n" +n);
      n1=n*n1;
    	n=1;	  
      sum=sum+n1;
      cnt++;
      i--;
     }

  System.out.println(" the output number is " +sum);
}




}