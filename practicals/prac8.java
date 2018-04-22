/*
Write a program that show working of different functions of String
and StringBufferclasss like setCharAt(, setLength(), append(),
insert(), concat()and equals().
*/


class Prac8
{
  public static void main(String args[])
  {
    //demonstration of charat function of stringbufferclass.



    StringBuffer buff1 = new StringBuffer("UTKARSH");
    System.out.println("buffer = " + buff1);

    // character at index 3
    System.out.println("character at index 3 = " + buff1.charAt(3));

    // set character at index 3
    buff1.setCharAt(3, 'L');

    System.out.println("After Set, buffer = " + buff1);

    // character at index 3
    System.out.println("character at index 3 = " + buff1.charAt(3));

//demonstration of setlength function of stringbufferclass.


StringBuffer buff2 = new StringBuffer("tutorials");
    System.out.println("buffer1 = " + buff2);

    // length of stringbuffer
    System.out.println("length = " + buff2.length());

    // set the length of stringbuffer to 5
    buff2.setLength(5);

    // print new stringbuffer value after changing length
    System.out.println("buffer2 = " + buff2);

    // length of stringbuffer after changing length
    System.out.println("length = " + buff2.length());

//demonstration of append function of stringbufferclass

StringBuffer buff3 = new StringBuffer("Utkarsh");
      buff3.append(" Singh");
      System.out.println(buff3);

      //demonstration of insert function of stringbufferclass


      StringBuilder buff4 = new StringBuilder("Utkarsh");
      System.out.println("string = " + buff4);

      // insert character value at offset 8
      buff4.insert(3, 's');

      // prints StringBuilder after insertion
      System.out.print("After insertion = ");
      System.out.println(buff4.toString());

      //concat method of string class
      String s1="utkarsh ";
   String s2="Singh";
   String s3=s1.concat(s2);
   System.out.println(s3);

   //equals of string class
   if(s1.equals(s2))
   {
    System.out.println("s1 is equal to s2 ");
   }
   else
   {
     System.out.println("s1 is not equals to s2");
   }
  }
}
