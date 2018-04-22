/*
<applet code="banner1" width="400" height="400"></applet>
*/

import java.awt.*;
import java.applet.*;

 public class banner1 extends Applet implements Runnable {
   String str = "This is a simple Banner ";
   Thread t ;
   boolean b;
   
   public void init() {
      setBackground(Color.gray);
      setForeground(Color.yellow);
   }
   public void start() {
      t = new Thread(this);
      b = false;
      t.start();
   }
   public void run () {
      char ch;
      for( ; ; ) {
      try {
         repaint();
         Thread.sleep(250);
         ch = str.charAt(0);
         str = str.substring(1, str.length());
         str = str + ch;
      }
      catch(InterruptedException e) {}
      }
   }
   public void paint(Graphics g) {
      
      g.drawString(str, 1, 150);
   }
}