
public class MyLinkedStack implements MyStack{
	
	private Node top;
	private int size;

	@Override
	public void push(int value) {
		
		Node newNode = new Node(value);
		if(isEmpty()) {
			
			this.top = newNode;
		
		} else {
			newNode.next = this.top;
			this.top = newNode;
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
	public int pop() {
		
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
		
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		
	}


}
