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
		
		
//		for (int i = 0; i < lista.getSize(); i++) {
//			System.out.println(lista.get(i));
//		}
		
		MyLinkedStack stack = new MyLinkedStack();
		
		stack.push(50);
		stack.push(100);
		stack.push(600);
		
		stack.pop();
		
		MyLinkedQueue queue = new MyLinkedQueue();
		
		queue.offer(500);
		queue.offer(800);
		queue.offer(1200);
		queue.offer(973);
		
		
		for (int i = queue.getSize(); i > 0; i--) {
			System.out.println(queue.poll());
		}
		
		

	}

}
