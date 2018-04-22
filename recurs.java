import java.util.Scanner;
class Recurs
{
	static int num = 1;
	static int meth(int x,int y)
	{
		
		if(y>0)
		{
			num = num*x;
			y-=1;
			meth(x,y);
		}

			return num;
		
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter x :");
		int x = sc.nextInt();
		System.out.print("enter y :");
		int y = sc.nextInt();;
		//Recurs r = new Recurs();
		System.out.println(meth(x,y));
	}
}