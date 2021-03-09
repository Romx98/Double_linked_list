package obojsmerny_linked_list;

public class Zoznam {

	private Polozka first = null;
	private Polozka last = null;
	
	
	public void pridajNaKonci(int data) {
		Polozka act = new Polozka();
		act.setData(data);
		
		if (last == null) {
			this.last = act;
			this.first = act;
		}
		else {
			act.setPrev(last);
			this.last.setNext(act);
			this.last = act;
		}
	}
	
	
	public void pridajNaZaciatok(int data) {
		Polozka act = new Polozka();
		act.setData(data);
		
		if (first == null) {
			this.first = act;
			this.last = act;
		}
		else {
			act.setNext(first);
			first.setPrev(act);
			this.first = act;
		}
	}
	
	public void odstranZoZaciatku() {
		if (first == last) {
			this.first = null;
			this.last = null;
		}
		else {
			Polozka next = first.getNext();
			this.first.setNext(null);
			next.setPrev(null);
			this.first = next;	
		}
		
	}
	
	
	public void odstranZKonca() {
		if (last == first) {
			this.last = null;
			this.first = null;
		}
		else {
			Polozka prev = last.getPrev();
			this.last.setPrev(null);
			prev.setNext(null);
			this.last = prev;
		}
	}
	
	public boolean obsahujePrvok(int data) {
		Polozka p = first;
		
		while (p != null) {
			if (p.getData() == data) 
				return true;
			p = p.getNext();
		}
		return false;
	}
	
	public boolean jePrazdny() {
		if (first == null)
			return true;
		return false;
	}
	
	public void vypisOdZaciatku() {
		Polozka p = first;
		
		while (p != null) {
			if (p.getNext() == null) 
				System.out.print(p.getData());
			else
				System.out.print(p.getData() + " -> ");
			p = p.getNext();
		}
	}
	
	
	public void vypisOdKonca() {
		Polozka p = last;
		
		while (p != null) {
			if (p.getPrev() == null) 
				System.out.print(p.getData());
			else
				System.out.print(p.getData() + " <- ");
			p = p.getPrev();
		}
	}
	
}
