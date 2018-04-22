    import java.io.*;  
    import java.net.*;  
    class MyServer
    {  
        public static void main(String[] args)
        {  
            try
            {  
                ServerSocket ss=new ServerSocket(6666);  
                Socket s=ss.accept();//establishes connection   
                DataInputStream dis=new DataInputStream(s.getInputStream());
                String str = null;  
                while(str!="exit")
                {
                    str=(String)dis.readUTF();  
                    System.out.println("message= "+str);
                }  
                
                ss.close();  
            }
            catch(Exception e)
            {
                System.out.println(e);
            }  
        }  
    }  