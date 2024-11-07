package L18Activity;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Printer document1 = new Printer("Manuscript_Final.pdf");
		Printer document2 = new Printer("Manuscript_Final_Final.pdf");
		
		Thread thread1 = new Thread(document1);
		Thread thread2 = new Thread(document2);
		
		thread1.start();
		thread2.start();
		
//		if (thread1.isAlive()) {
//			System.out.println("Thread-0 status: running");
//		} else {
//			System.out.println("Thread-0 status: terminated");
//		}
//		
//		if (thread2.isAlive()) {
//			System.out.println("Thread-1 status: running");
//		} else {
//			System.out.println("Thread-1 status: terminated");
//		}
		
		thread1.join();
		thread2.join();
	}
}
