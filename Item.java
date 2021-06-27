package group9;

public class Item {
	private String producer;
	private int id;
	
	public Item(String producer, int id){
		 this.producer = producer;
		 this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public String getProducer(){
		return producer;
	}
	
	public String itemDisp(){
		return String.format("%s - ID %d", producer, id);
	}

}
