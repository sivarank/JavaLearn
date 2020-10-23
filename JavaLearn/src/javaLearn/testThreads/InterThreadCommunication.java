package javaLearn.testThreads;

import java.lang.Thread.State;

class PC{
	void produce() {
        synchronized(this)
        {
    		System.out.println("Produced, before wait");
    		try {
    			// releases the lock on shared resource
    			wait();
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    		System.out.println("Close producer, after wait()");      	
        }
	}
	
	void consumer() {
        synchronized(this)
        {
    		try {
    			// this sleep allows producer to get CPU
    			//Thread.sleep(1000);
    			Thread.yield();
    			
    		//	Scanner scan = new Scanner(System.in);
    		//	System.out.println(scan.nextLine());
    			
    			System.out.println("Consumer, before notify");
                // notifies the produce thread that it
                // can wake up.
    			notify();
    			System.out.println("Consumer, after notify");
                // Sleep
               // Thread.sleep(2000);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}      	
        }
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		PC pc = new PC();
		Thread producerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				pc.produce();
			}
		});

		Thread consumerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				pc.consumer();
			}
		});
		
		producerThread.start();	
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		consumerThread.start();

		
		State state1 = consumerThread.getState();
		State state2 = producerThread.getState();
		
		System.out.println(state1);
		System.out.println(state2);
		
		try {
			consumerThread.join(2000);
			producerThread.join(2000);
			
			System.out.println(consumerThread.getState());
			System.out.println(producerThread.getState());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
