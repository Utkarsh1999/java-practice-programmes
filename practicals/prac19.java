import java.io.*;

class nested 
{
    public static void main(String args[])
    {
        try{
            System.out.println("outer try called");
            if(false)
                throw new Exception("outer exception");
                try{
                    System.out.println("inner try called");
                    
                    throw new Exception("inner exception");
                }
                catch(Exception e1)
                {
                    System.err.println(e1);
                }
                    
        }
        catch(Exception e)
        {
            System.err.println(e);
            System.err.println("outer catch called");
        }
    }
}