//programme to implement exception handling with or without throw keyword.

import java.util.Scanner;
class Exceptionimplementation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
			int input_number = sc.nextInt();
			if(input_number<10)
			{
				throw new ArithmeticException( "number is less than 10 exception" );
			}
		
		
		System.out.println(input_number);
	}
}


