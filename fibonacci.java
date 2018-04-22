import java.lang.Integer;
class Fibo
{
	static void fibometh(int n)
	{
		int num1 =0 , num2 = 1 , num3=0;
		for(int counter = 0;counter<n;counter++)
		{
			
			System.out.println(num3);
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}
	}

	 public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		fibometh(n);	
	}
}