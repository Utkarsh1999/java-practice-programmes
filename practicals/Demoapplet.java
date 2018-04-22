/*
<applet code="Demoapplet" height="220" width="100">
  <param name="line1" value="GM1"></param>
  <param name="line2" value="GM2"></param>
  <param name="line3" value="GM3"></param>
  <param name="line4" value="GM4"></param>
</applet>

*/
import java.applet.*;
import java.awt.*;

public class Demoapplet extends Applet
{
  String arr[] = new String[100];
  int counter;
  public void init()
  {
    for(counter=0;counter<arr.length;counter++)
    {
      String data = this.getParameter("line"+counter);
      if(data==null)
      {
        break;
      }

      arr[counter] = data;
      System.out.println(arr[counter]);
    }

  }



  public void paint(Graphics g)
  {
    int width=20;
    for(int i = 0;i<counter;i++)
    {
        g.drawString(arr[i],15,width);
        g.drawString("hello",15+i,10);
    }

  }
}
