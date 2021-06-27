package group9;

/* 
 * CS3003 Assignment 6 Group 9
 * implementation of a multi-threaded producer-consumer design pattern
 */

public class Item {
	private String producer;
	private int id;
	
	// constructor
	public Item(String producer, int id){
		 this.producer = producer;
		 this.id = id;
	}
	
	// method to return item id
	public int getId(){
		return id;
	}
	
	// method to return producer name
	public String getProducer(){
		return producer;
	}
	
	// method to format string output of item
	public String itemDisp(){
		return String.format("%s - ID %d", producer, id);
	}

}
