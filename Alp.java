import java.util.Scanner;

class Alp {
	public static void main (String[] args) throws java.lang.Exception
	{
	   char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
    
 if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
   
     System.out.println("Alphabet");
   }
   
	 else{
	System.out.println("No");	
   }
  
  }
}

