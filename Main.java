import java.util.Scanner;

class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
	   int n;
		Scanner s=new Scanner(System.in);
		n= s.nextInt();
	
		if(n>0)
		{
			System.out.println("Positive");
		}
		
		else if(n==0)
		{
			System.out.println("zero");
		}
    else{
    System.out.println("Negative");
    }
  
	}
}
