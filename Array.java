import java.util.Scanner;
class Array
{
	public static void main (String[] args) throws java.lang.Exception
	{
 int n,k;
 int sum=0;
 int[] av;
 Scanner s=new Scanner(System.in);
 n=s.nextInt();
 k=s.nextInt();
 av=new int[n];
 for(int i=0;i<n;i++)
 {
 	av[i]=s.nextInt();
 
 }
 for(int i=0;i<k;i++)
 {
 	sum=sum+av[i];
 }
 System.out.println(+sum);
	}
}
