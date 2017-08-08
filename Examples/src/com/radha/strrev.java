package com.radha;

public class strrev {
	String str2="";
	int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	       String str="Radha";
	       
	        strrev srev=new strrev();
	       srev.n=str.length();
	        String tmp=srev.revstring(str);
	System.out.println("the result is"+tmp);

		
		
	}
	public String revstring(String str)
	{
	  n=n-1;

	if (n==0){
     str2=str2+str.charAt(0);
     
	  
	}
	 else{
	  
	  str2=str2+str.charAt(n)+revstring(str);
	  
	}

return str2;
}
}