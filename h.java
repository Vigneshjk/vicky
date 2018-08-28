class oper
{
	public static void main (String[] args) 
	{
		
		double num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		num1=s.nextDouble();
		System.out.println("enter the second number");
		num2=s.nextDouble();
		System.out.println("enter the operator(+,-,*,/):");
		char operator =s.next().charAt(0);
		double result;
		switch(operator)
		{
			case '+':
				result=num1+num2;
					System.out.println("the result is:"+result);
				break;
				case '-':
					result=num1-num2;
						System.out.println("the result is:"+result);
					break;
					case '*':
						result=num1*num2;
							System.out.println("the result is:"+result);
						break;
						default:
							if(num2==0){
								System.out.println("infinite");
							}
							
							else{
									result=num1/num2;
			System.out.println("the result is:"+result);
							}
		}
	

	}
}
