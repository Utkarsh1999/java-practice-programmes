    import java.io.*;  
    import java.net.*;  
    import java.util.Scanner;
    class MyClient
    {  
        public static void main(String[] args) {  
        try
        {      
            Socket s=new Socket("localhost",6666);  
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
            Scanner sc = new Scanner(System.in);
            while(sc.nextLine()!=null)
            {

            dout.writeUTF(sc.next());  
            dout.flush();  
            }
            dout.close();  
            s.close();  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
        
        }  
    }  