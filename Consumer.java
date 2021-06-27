package group9;
import java.util.concurrent.BlockingQueue;

/* 
 * CS3003 Assignment 6 Group 9
 * implementation of a multi-threaded producer-consumer design pattern
 */

public class Consumer implements Runnable {
	private String name;
	private BlockingQueue<Item> queue;
	
	// constructor
	public Consumer(String name, BlockingQueue<Item> queue){
		this.name = name;
		this.queue = queue;
	}
	
	// method to consume items in the shared queue
	public void consume(){
		// infinite loop to clear out queue
		while(true) {
			try {
				// take item from shared queue
				Item tItem = queue.take();
				// print consume message to interface
				System.out.println(String.format("Consume: %s (By %s)", tItem.itemDisp(), name));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}
	
	// implement the abstract method inherited from Runnable interface
	public void run() {
		// call consume method defined above
		consume();
	}

}
