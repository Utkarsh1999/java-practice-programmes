/*
	write a variable length argument method which displays the values of arguments passed as 
  	  parameters. call that method in main with 0 arg , 1 arg , 2 arg
 */
import java.util.Scanner;

class Test1
{
    static void fun(int ...a)
    {
         	System.out.println("Number of arguments: " + a.length);
 		
 
        for (int i: a)
        {
        	 System.out.print(i + " ");


        }   
        System.out.println();
    }
 
 
    public static void main(String args[])
    {
    	// Scanner sc = new Scanner(System.in);
       //  fun(sc.nextInt());
        fun(1, 2, 3, 4);  
        fun(1,2);            
    }
}