// Write a program to show the use of static functions and to pass variable length arguments in a
// function
import java.util.Date;
class Prac13
{
  public static void main(String args[])
  {
    //invoke the getDate function using the classname i.e without making any instance of that class.
    example13.getDate();
    //static function with variable arguments
    example13.getSum(1,2,3);//with 3 arguments
    example13.getSum(1,2);//with 2 arguments
    example13.getSum(1,2,3,4);//with 4 arguments
    example13.getSum();//with 0 arguments
  }


}

class example13
{
  public static void getSum(int ...x)
  {
    int sum = 0;
    int count=0;
    for(int i:x)
    {
      sum = sum+i;
      count++;
    }
    System.out.println("Sum of "+count+" arguments is : "+sum);
  }


  public static void getDate()
  {
    Date date = new Date();
    System.out.println("today's date is : "+date.toString());
  }
}
