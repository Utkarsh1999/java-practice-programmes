/*
<applet code="banner" width="400" height="400"></applet>
*/

import java.awt.*;
import java.applet.*;

 public class banner extends Applet implements Runnable {
   String str = "This is a simple Banner ";
   Thread t ;
   boolean b;
   int len = str.length();
   
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
         ch = str.charAt(len-1);
         str = str.substring(0, len-1);
         str = ch + str;
      }
      catch(InterruptedException e) {}
      }
   }
   public void paint(Graphics g) {
      
      g.drawString(str, 1, 150);
   }
}