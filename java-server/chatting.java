import java.net.*;
import java.io.*;

public class Server
{
	public static void main(String args[]) throws IOException
	{
		ServerSocket s1 = null;
		try
		{
			s1 = new ServerSocket(98);
		}
		catch(IOException u1)
		{
			System.err.println("could not found port 98");
			System.exit(1);
		}

		Socket c = null;

		try
		{

			c = s1.accept();
			System.out.println("Connection from" + c);
		}
		catch(IOException e)
		{
			System.out.println("accept failed");
			System.exit(1);
		}
	}
}