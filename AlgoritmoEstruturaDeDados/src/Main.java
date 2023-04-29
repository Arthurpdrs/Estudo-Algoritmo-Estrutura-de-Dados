import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add(10);
		bst.add(7);
		bst.add(3);
		bst.add(12);
		bst.add(11);
		
		//bst.preOrderTraversal();
		
		bst.inOrderTraversal();
		
		System.out.println(bst.contains(10));
		System.out.println(bst.contains(12));
		System.out.println(bst.contains(7));
		System.out.println(bst.contains(500));

	}

}
