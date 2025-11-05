import java.util.*;
class J extends Thread
{   
  public void run()
   {
      try
      { for(int i=0;i<5;i++) 
        {  System.out.println("I am j");
           Thread.sleep(10000);
        }
      }

   catch(Exception e)
   { System.out.println(e);
   }
  }
}//class
class K extends Thread
{ public void run()
  { 
     try
      { for(int i=0;i<50;i++)
        { System.out.println("I am k...");
          Thread.sleep(1000);
        }
      }
  catch(Exception e)
  { System.out.println(e);
  }
 }
}//class
public class THAPP
{ public static void main(String args[]) 
  {  J j=new J();
      j.start();
   String tName=j.getName();
   System.out.println(tName);

    K k=new K();
      k.start();
    String tName2=k.getName();
   System.out.println(tName2);
  }
}//class