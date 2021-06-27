package group9;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private String name;
	private BlockingQueue<Item> queue;
	private int itemId;
	
	public Producer(String name, BlockingQueue<Item> queue){
		this.name = name;
		this.queue = queue;
		// how should itemId be initialized
		this.itemId = 0;
	}
	
	public void produce(){
		// Produce 10 items for the shared queue
		for(int i=0; i<10; i++){
			try {
				Item tItem = new Item(name, itemId++);
				queue.put(tItem);
				System.out.println(String.format("Produce: %s", tItem.itemDisp()));
				
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
