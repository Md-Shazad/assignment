package assignment6;

class ThreadUsingRunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable thread starts and going to sleep for 2 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("lets hope join works and after this statement Thread class will start");
		
	}
	
}

class ThreadUsingThreadClass extends Thread{
	@Override
	public void run() {
		System.out.println("Thread class thread starts");
	}
}

public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		ThreadUsingRunnableInterface RunnableThread = new ThreadUsingRunnableInterface();
		Thread tRunnable = new Thread(RunnableThread);
		
		ThreadUsingThreadClass tThread = new ThreadUsingThreadClass();
		
		tRunnable.start();
		tRunnable.join();
		tThread.start();
		
		

	}

}
