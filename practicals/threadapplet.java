/*
<applet code="threadapplet"></applet>
*/

import java.awt.*;
import java.applet.*;
import java.util.Date;

class Myapp implements Runnable
{
    Thread t = new Thread();
    String dat = null;
    public void run()
    {
      for(;;)
      {

        Date date = new Date();
        System.out.println("today's date is : "+date.toString());
        this.dat = date.toString();
    }
    }
}

class threadapplet extends Applet
{
  public static void main(String args[])
  {
  Myapp m = new Myapp();
  //m.run();
  Graphics g;
  g.drawString(m.dat,20,30);
}
}
