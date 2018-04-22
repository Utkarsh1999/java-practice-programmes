import java.io.*;
import java.util.Scanner;

class prac18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        try{
            if(b==0)
                throw new ArithmeticException( "divide by zero exception" );
            else{
                c = a/b;
            System.out.println("divison is : "+c);
            }
        }
        catch(ArithmeticException e)
        {
            System.err.println(e);
        }
    }
}