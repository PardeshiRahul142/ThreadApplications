class AROBO extends Thread
{
     public void run()
     {
       try
       { System.out.println("I am feeting 4 door");
         Thread.sleep(1000);
         System.out.println("I am feeting bhumper");
         Thread.sleep(1000);
         System.out.println("I am feeting 4 wheels");
         Thread.sleep(1000);
       }
       catch(Exception e)
       { System.out.println(e);
       }
     }
}
class BROBO extends Thread
{  
   public void run()
   {
      try{
       System.out.println("I am painting the 4 door");
       Thread.sleep(1000);
       System.out.println("I am painting the bhumper");
       Thread.sleep(1000);
       System.out.println("I am painting 4 wheels");
      }
      catch(Exception e)
      {  System.out.println(e);
      }
   }//run
}//class
public class JOINMAPP
{  public static void main(String args[])throws Exception
   {
     AROBO ab=new AROBO();
           ab.start();
          // ab.join();

     BROBO bo=new BROBO();
           bo.start();
   }
}//class