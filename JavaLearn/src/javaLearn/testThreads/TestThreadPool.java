package javaLearn.testThreads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Task class to be executed (Step 1)
class Task implements Runnable   
{
 private String name;
  
 public Task(String s)
 {
     name = s;
 }
  
 // Prints task name and sleeps for 1s
 // This Whole process is repeated 5 times
 public void run()
 {
     try
     {
         for (int i = 0; i<=5; i++)
         {
             if (i==0)
             {
                 Date d = new Date();
                 SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                 System.out.println("Initialization Time for"
                         + " task name - "+ name +" = " +ft.format(d));   
                 //prints the initialization time for every task 
             }
             else
             {
                 Date d = new Date();
                 SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                 System.out.println("Executing Time for task name - "+
                         name +" = " +ft.format(d));   
                 // prints the execution time for every task 
             }
             Thread.sleep(1000);
         }
         System.out.println(name+" complete");
     }
      
     catch(InterruptedException e)
     {
         e.printStackTrace();
     }
 }
}

public class TestThreadPool {

	public static void main(String[] args) {
		
		 ExecutorService pool = Executors.newFixedThreadPool(3);
		 
		 Runnable t1 = new Task("T1");
		 Runnable t2 = new Task("T2");
		 Runnable t3 = new Task("T3");
		 Runnable t4 = new Task("T4");
		 Runnable t5 = new Task("T5");
		 
		 pool.execute(t1);
		 pool.execute(t2);
		 pool.execute(t3);
		 pool.execute(t4);
		 pool.execute(t5);
		 
	}

}
