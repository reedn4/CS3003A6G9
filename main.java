package group9;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

/* 
 * CS3003 Assignment 6 Group 9
 * implementation of a multi-threaded producer-consumer design pattern
 */

public class main {

	public static void main(String[] args) {
		
		// Create BlockingQueue of size 20
		BlockingQueue<Item> queue = new ArrayBlockingQueue(20);
		
		// Create first thread for Producer 1
		new Thread(new Producer("Producer 1", queue)).start();
		// Create second thread for Producer 2
		new Thread(new Producer("Producer 2", queue)).start();
		
		// Create third thread for Consumer 1
		new Thread(new Consumer("Consumer 1", queue)).start();
		// Create fourth thread for Consumer 2
		new Thread(new Consumer("Consumer 2", queue)).start();
		// Create fifth thread for Consumer 3
		new Thread(new Consumer("Consumer 3", queue)).start();

	}

}
