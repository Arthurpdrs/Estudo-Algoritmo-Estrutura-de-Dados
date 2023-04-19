import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
		DoubleLinkedList lista = new DoubleLinkedList();
		
		lista.add(5);
		lista.add(12);
		lista.add(9);
		lista.add(20);
		lista.add(30);
		lista.add(50);
		lista.add(60);
		
		lista.add(273, 6);
		
		lista.remove(7);
		
		
		for (int i = 0; i < lista.getSize(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
