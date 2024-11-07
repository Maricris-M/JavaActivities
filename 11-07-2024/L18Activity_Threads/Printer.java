package L18Activity;

public class Printer implements Runnable {
	
	private String documentName;

	@Override
	public void run() {
		printDocuments();
	}
	
	public Printer(String documentName) {
		this.documentName = documentName;
	}

	private void printDocuments() {
		System.out.println("Printing: " + documentName);
		synchronized (Printer.class) {
			try {
				System.out.println(Thread.currentThread().getName() + ": running");
				Thread.sleep(2000);
				System.out.println("Finished printing: " + documentName);
				System.out.println(Thread.currentThread().getName() + " : terminated");
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
