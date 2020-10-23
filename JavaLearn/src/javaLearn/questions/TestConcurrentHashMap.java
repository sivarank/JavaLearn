package javaLearn.questions;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TestConcurrentHashMap {
	static ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<String, Integer>();

	static void processOrders() {

		for (String name : cmap.keySet()) {
			for (int i = 0; i < 50; i++) {

				Integer syn = 1;
				// Learn: we can fix below synchronization problem two ways. 1) Synchronize
				// block 2) AtomicInterger and increment api "(new
				// AtomicInteger(1)).incrementAndGet()"

				// Learn: we suppose to get A=100, B=100, C==100 but we get random values
				// because of race condition
				//synchronized (this) {
				synchronized (syn) {
				Integer val = cmap.get(name);
				cmap.put(name, val + 1);
				}
				
				//Learn: below code does not solve problem
				//AtomicInteger input = new AtomicInteger(cmap.get(name));
				//cmap.put(name, input.incrementAndGet());
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		cmap.put("A", 0);
		cmap.put("B", 0);
		cmap.put("C", 0);

		ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(TestConcurrentHashMap::processOrders);
		es.submit(TestConcurrentHashMap::processOrders);
		es.execute(new Runnable() {
			
			@Override
			public void run() {
System.out.println("latest thread");				
			}
		});
		es.awaitTermination(1, TimeUnit.SECONDS);
		es.shutdown();
		System.out.println(cmap);
	}

}
