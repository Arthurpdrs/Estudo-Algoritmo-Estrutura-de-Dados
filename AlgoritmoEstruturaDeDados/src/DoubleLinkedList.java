
public class DoubleLinkedList implements MyList{
	
	private int size;
	private Node head;
	private Node tail;
	
	@Override
	public void add(int valor) {
		
		Node newNode = new Node(valor);
		
		if(isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.previous = this.tail;
			this.tail.next = newNode;
			this.tail = newNode;
		}
		this.size++;
		
	}

	@Override
	public void add(int valor, int pos) {
		
		if(pos < 0 || pos > this.size-1) {
			throw new IndexOutOfBoundsException("Posicao invalida!");
		}
		
		Node newNode = new Node(valor);
		
		if(pos == 0) {
			
			newNode.next = this.head;
			this.head.previous = newNode;
			this.head = newNode;
			
		} else if(pos > this.size / 2) {
			
			Node current = this.tail;
			
			for(int i = this.size; i > pos+1; i--) {
				current = current.previous;
			}
			
			newNode.previous = current.previous;
			current.previous.next = newNode;
			current.previous = newNode;
			newNode.next = current;
			
		} else {
			
			Node current = this.head;
			
			for(int i = 0; i < pos-1; i++) {
				current = current.next;
			}
			
			newNode.next = current.next;
			current.next.previous = newNode;
			current.next = newNode;
			newNode.previous = current;
		}
		
		this.size++;
		
	}

	@Override
	public void remove(int pos) {
		
		if(pos < 0 || pos > this.size-1) {
			throw new IndexOutOfBoundsException("Posicao invalida!");
		}
		
		if(pos == 0) {
			this.head = this.head.next;
		
		} else if(pos == this.size - 1){
			
			this.tail = this.tail.previous;
			
		} else {
			
			Node current = this.head;
			for(int i = 0; i < pos-1; i++) {
				current = current.next;
			}
			
			current.next = current.next.next;
			current.next.previous = current;
		}
		
		this.size--;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public int get(int pos) {
		
		if(pos < 0 || pos > this.size-1) {
			throw new IndexOutOfBoundsException("Posicao invalida!");
		}
		
		Node current = this.head;
		for(int i = 0; i < pos; i++) {
			current = current.next;
		}
		
		return current.value;
	}

	@Override
	public boolean isEmpty() {
		if(this.size == 0) {
			return true;
		}
		return false;
	}
	
	private class Node{
		
		private int value;
		private Node next;
		private Node previous;
		
		public Node(int value) {
			this.value = value;
		}
	}

}
