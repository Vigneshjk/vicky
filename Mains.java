import java.util.Scanner;

class Mains {
	public static void main (String[] args) throws java.lang.Exception
	{
	   char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
    
 if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
   {
     System.out.println("Vowel");
   }
   else
   {
     System.out.println("Consonant");
   }
 }
	 else{
	System.out.println("invalid");	
   }
  
  }
}
