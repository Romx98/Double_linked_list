package obojsmerny_linked_list;

public class Polozka {

	private int data;
	private Polozka next;
	private Polozka prev;
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Polozka getNext() {
		return next;
	}
	
	public void setNext(Polozka next) {
		this.next = next;
	}
	
	public Polozka getPrev() {
		return prev;
	}
	
	public void setPrev(Polozka prev) {
		this.prev = prev;
	}
	
}
