public class LETAPP
{  public static void main(String args[])
  {  new Thread(()->{
          try
          { for(int i=0;i<5;i++)
            { System.out.println("I am thread"+i);
              Thread.sleep(1000);
            }
          }
         catch(Exception e) 
          { System.out.println(e);
          }

     }).start();
  }
}