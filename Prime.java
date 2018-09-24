import java.util.Scanner;

class Prime {
	public static void main (String[] args) throws java.lang.Exception
	{
	   int n;
		Scanner s=new Scanner(System.in);
		n= s.nextInt();
	
		if(n % 2 ==0)
		{
			System.out.println("Even");
		}
		
		else if(n<0)
		{
			System.out.println("invalid");
		}
    else
    {
    System.out.println("Odd");
    }
  
	}
}
