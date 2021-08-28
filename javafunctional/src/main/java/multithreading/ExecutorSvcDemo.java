package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSvcDemo {

	public static void main(String[] args) {
		// when CPU intensive equal to cores ( consider other applications etc. )
		// when IO intensive give a higher number
		int coreCount = Runtime.getRuntime().availableProcessors();
		
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		//blocking queue - thread safe
		for (int i = 0; i < 100; i++) {
		
			service.execute(() -> {
				System.out.println("pika!!");
			});
		}
		
		
		

	}
	
	
	

}
