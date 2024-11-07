package Exercise9;
import java.util.LinkedList;
import java.util.Queue;

class ThreadA extends Thread {
	MainThread t;
	ThreadA(MainThread t) {
		this.t = t;
	}
	
	public void run() {
		try {
			t.sendMessage("");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MainThread {
	void sendMessage(String message) throws InterruptedException {
		Thread.sleep(200);
		
		Queue<String> messageQueue = new LinkedList<>();

        messageQueue.add("Hello");
        messageQueue.add("My name is JavaBot");
        messageQueue.add("Nice to meet you!");
        
        while (!messageQueue.isEmpty()) {
            System.out.println(messageQueue.poll());
        }
	}
}

public class MessagingSystem {
    public static void main(String[] args) {
    	MainThread t = new MainThread();
		ThreadA tA = new ThreadA(t);
		
		tA.start();
    }
}
