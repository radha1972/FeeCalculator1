
public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=565,res;
      String input="radha";
      input=input+"ramani";
      System.out.println("input"+input);
      Sumofdigit s=new Sumofdigit();
      res=s.sum(n);
      System.out.println("res"+res);
      
	}
 public int sum(int n)
 {
	int res=0,x=0,y=0;
	if (n>0)
	{x=n % 10;
	y=n / 10;
	res=x+sum(y);}
	else
	{	res=res+y;
	}
	return res;
 }
}
