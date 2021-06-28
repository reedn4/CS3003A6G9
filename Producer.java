package group9;
import java.util.concurrent.BlockingQueue;

/* 
 * CS3003 Assignment 6 Group 9
 * implementation of a multi-threaded producer-consumer design pattern
 */

public class Producer implements Runnable {
	private String name;
	private BlockingQueue<Item> queue;
	private int itemId;
	
	public Producer(String name, BlockingQueue<Item> queue){
		this.name = name;
		this.queue = queue;
		// start with id 0
		this.itemId = 0;
	}
	
	public void produce(){
		// Produce 10 items for the shared queue
		for(int i=0; i<10; i++){
			try {
				// create new Item
				Item tItem = new Item(name, itemId++);
				// print produce message to interface
				System.out.println(String.format("Produce: %s", tItem.itemDisp()));
				// put new Item in shared queue
				queue.put(tItem);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// implement the abstract method inherited from Runnable interface
	public void run() {
		// call produce method defined above
		produce();
	}

}
