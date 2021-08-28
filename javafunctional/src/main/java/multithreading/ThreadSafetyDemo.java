package multithreading;



class Counter {
	
	int counter;
	
	// or AtomicInteger count = new AtomicInteger();
	
	public synchronized void increment() {
		
		counter++;
		
		// or count.incrementAndGet()
	}
	
}



public class ThreadSafetyDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		
		
		Thread t1 = new Thread( () -> {
				for (int i = 1; i<=1000; i++)
					c.increment();
				
		});
		
		Thread t2 = new Thread( () -> {
			for (int i = 1; i<=1000; i++)
				c.increment();
			
	});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println(c.counter);
		
	}

}
