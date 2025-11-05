class RT implements Runnable
{ 
  public void run()
  {
    try
    {  for(int i=0;i<5;i++)
       {  System.out.println("I am runable"+i);
          Thread.sleep(1000);
       }
    }
   catch(Exception e)
   { System.out.println(e);
   }
  }
}//class
public class RIAPP
{ public static void main(String args[])
  { 
     RT rt=new RT();
     Thread t=new Thread(rt);
        t.start();
  }

}
