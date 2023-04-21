
public class MyLinkedQueue implements MyQueue{
	
	private Node top;
	private int size;

	@Override
	public void offer(int value) {
		
		Node newNode = new Node(value);
		
		if(isEmpty()){
			
			this.top = newNode;
			
		} else {
			Node current = this.top;
			
			for (int i = 0; i < this.size-1; i++) {
				current = current.next;
			}
			
			current.next = newNode;
			
		}
		
		this.size++;
	}

	@Override
	public int peek() {
		
		if(isEmpty()) {
			throw new RuntimeException("Empty Stack!");
		}
		
		return this.top.value;
	}

	@Override
	public int poll() {
		
		if(isEmpty()) {
			throw new RuntimeException("Empty Stack!");
		}
		
		int value = this.top.value;
		this.top = this.top.next;
		this.size--;
		return value;
	}

	@Override
	public int getSize() {
		
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		
		if(this.size == 0) {
			return true;
		}
		return false;
	}
	
	private class Node{
		
		private Node next;
		private int value;
		
		public Node(int value) {
			this.value = value;
		}
		
		
	}

}
