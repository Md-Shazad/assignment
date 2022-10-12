package assignment6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource2{
	synchronized void begin(Resource r1) {
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Exception Occured and Handled");
		}
		System.out.println(name);
	}
	
	synchronized void last() {
		System.out.println("Inside DeadlockExample last");
	}
}

class Resource{
	synchronized void barredResource(Resource2 r2) {
		String name= Thread.currentThread().getName();
		System.out.println(name);
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("Exception occured again");
		}
		System.out.println(name);
	}
	
	synchronized void last() {
		System.out.println("Inside resource class last");
	}
}
public class Q5 implements Runnable{
	Resource2 r2 = new Resource2();
	Resource r1=new Resource();
	
	Thread t;
	
	Lock lock =new ReentrantLock();
	
	Q5(){
		Thread.currentThread().setName("MainThread");
		t= new Thread(this, "This thread Races");
	}
	
	void StartedDeadlock() {
		t.start();
		lock.lock();
		
		
		r1.barredResource(r2);
		r2.begin(r1);
		
		lock.unlock();
	}
	public static void main() {
		Q5 obj = new Q5();
		obj.StartedDeadlock();
	}


	@Override
	public void run() {
		lock.lock();
		r1.barredResource(r2);
		System.out.println("in other thread");
		
	}
}
