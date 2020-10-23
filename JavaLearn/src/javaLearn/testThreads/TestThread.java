package javaLearn.testThreads;


// Thread can be create by using interface "Runnable" or extending "Thread"
class A implements Runnable{

	@Override
	public void run() {
		System.out.println("inner thread");
        // Displaying the thread that is running
        System.out.println ("Thread " +
              Thread.currentThread().getId() +
              " is running");
        
        try {
        	Thread.sleep(1500);
        }catch(Exception ex) {
        	System.out.println(ex);
        }
		
	}
	
}

// Learn: Thread class implements Runnable interface 
class B extends Thread{
	@Override
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                  Thread.currentThread().getId() +
                  " is running");
 
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

public class TestThread {

	public static void main(String[] args) {
		
		
        // getting reference to Main thread
        Thread t = Thread.currentThread();
         
        // getting name of Main thread
        System.out.println("Current thread: " + t.getName());
         
        // changing the name of Main thread
        t.setName("Geeks");
        System.out.println("After name change: " + t.getName());
         
        // getting priority of Main thread
        System.out.println("Main thread priority: "+ t.getPriority());
         
        // setting priority of Main thread to MAX(10)
        t.setPriority(10);
        // getting priority of Main thread
        System.out.println("Main thread priority: "+ t.getPriority());
        
        System.out.println ("Thread " +
                Thread.currentThread().getId() +
                " is running");
		Thread thread = new Thread(new A());
		
		System.out.println("created Thread state : "+thread.getState());
		thread.start();
		System.out.println("created Thread state after state() method : "+thread.getState());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("created Thread state after state() method : "+thread.getState());
		try {
			thread.join(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("created Thread state after state() method : "+thread.getState());
		
		try {
			thread.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("created Thread state after state() method : "+thread.getState());
		
		B obj = new B();
		obj.start();
	}

}
