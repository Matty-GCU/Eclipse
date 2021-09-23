package chapter4;

class Node {
	String data;
	Node lChild;
	Node rChild;
	void traversal(Node root) {
		if(root == null)
			return;
		traversal(root.lChild);
		System.out.println(root.data);
		traversal(root.rChild);
	}
}

public class traversalTree {

	public static void main(String[] args) {
		Node root = new Node();
		root.traversal(root);	
	}

}
