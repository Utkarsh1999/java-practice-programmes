import java.io.*;

class utkarsh
{
  public static void main(String args[])
  {

    FileOutputStream fout = null;
    int c=1;
    try(FileInputStream fin = new FileInputStream("source.txt");)
    {
      do{
        fin.read();
        if(c!=-1)
          System.out.println((char)c);
        }while(c!=-1);
    }
    catch(FileNotFoundException ferr)
    {
      System.err.println("error in file opening"+ferr);
    }
    catch(IOException ioerr)
    {
      System.err.println("error in io"+ioerr);
    }
  }
}
