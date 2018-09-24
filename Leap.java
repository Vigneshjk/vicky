import java.util.Scanner;

class Leap {
	public static void main (String[] args) throws java.lang.Exception
	{
 int year;
 Scanner sca=new Scanner(System.in);
 year=sca.nextInt();                
   

        if (year % 4 == 0){
            System.out.println("yes");
         
        }
        else {
            System.out.println("no");
           
        }
    }   

}


