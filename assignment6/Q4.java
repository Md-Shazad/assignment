package assignment6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class CallableExample implements Callable<String>{
	public String call() throws Exception{
		return "Callable Example";
	}
}

class RunnableExample implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable Example");
	}
}


public class Q4 {
	static ExecutorService executor = Executors.newFixedThreadPool(2);
	public static void main() throws InterruptedException, ExecutionException {
		CallableExample callableTask = new CallableExample();
		
		RunnableExample runnableTask = new RunnableExample();
		
		Thread thread = new Thread(runnableTask);
		
		ExecutorService executorServiceTask = Executors.newSingleThreadExecutor();
		
		executorServiceTask.execute(thread);
		
		Future<String> message = executor.submit(callableTask);
		System.out.println(message.get().toString());
	}
}
