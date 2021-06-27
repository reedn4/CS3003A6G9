package group9;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private String name;
	private BlockingQueue<Item> queue;
	
	public Consumer(String name, BlockingQueue<Item> queue){
		this.name = name;
		this.queue = queue;
	}
	
	public void consume(){
		while(true) {
			try {
				Item tItem = queue.take();
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
