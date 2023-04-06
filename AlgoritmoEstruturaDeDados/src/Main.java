import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
		MyArrayList lista = new MyArrayList(3);
		
		lista.add(5);
		lista.add(12);
		lista.add(9);
		lista.add(15);
		
		lista.add(80, 3);
		
		lista.remove(3);
		
		//System.out.println(lista.getSize());
		
		for (int i = 0; i < lista.getSize(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
