class Thrun implements Runnable
{
  Thread t;
  boolean runn = true;
  Thrun(String name,int p)
  {
    t= new Thread(this,name);
    t.setPriority(p);
    t.start();
  }

  public void run()
  {
    System.out.println("Thread name "+t.getName());
    System.out.println("Thread Priority"+t.getPriority());
  }
}

class Priority
{
    public static void main(String args[])
    {
      //Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
      Thrun t1 = new Thrun("thread1",2);
      Thrun t2 = new Thrun("thread2",1);
      System.out.println("currentThread : "+Thread.currentThread());
      System.out.println("currentthread priority : "+Thread.currentThread().getPriority());
    }
}
