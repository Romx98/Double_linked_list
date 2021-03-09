package obojsmerny_linked_list;

public class Main {

	
	public static void main(String[] args) {
		Zoznam linked_list = new Zoznam();
		String sep = "\n---------------------------";
		
		linked_list.pridajNaZaciatok(3);
		linked_list.pridajNaZaciatok(2);
		linked_list.pridajNaZaciatok(1);
		
		linked_list.pridajNaKonci(4);
		linked_list.pridajNaKonci(5);
		
		System.out.println(sep);
		
		System.out.println(linked_list.obsahujePrvok(5));
		
		System.out.println(sep);
		
		System.out.println(linked_list.jePrazdny());
		
		System.out.println(sep);
		linked_list.odstranZoZaciatku();
		linked_list.vypisOdZaciatku();
		
		linked_list.odstranZKonca();

		System.out.println(sep);
		
		linked_list.vypisOdKonca();
	}
}
