package Exercise9;

public class Main {
	public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
//        thread.start();
        
        MyRunnable myRunnable = new MyRunnable();
        Thread threadR = new Thread(myRunnable);
//        threadR.start();
        
        thread.start();
        threadR.join();
        System.out.println("Thread has finished execution.");
        
        Thread.sleep(1000);
        System.out.println("1 second paused.");
 
    }
}

 class MyThread extends Thread{
	 private Object lock = new Object();
	 
	@Override
	public void run() {
		// System.out.println("This is my Thread.");
		
		synchronized (lock) {
			System.out.println("This is my Thread.");
            System.out.println("Inside synchronized block.");
        }
	}
}
 
class MyRunnable implements Runnable {
	@Override
    public void run() {
        // Define the task to be executed by this thread
        System.out.println("Runnable task is running.");
    }
}
