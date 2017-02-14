package ds.binarysearchtree;

public class BinarySearchTree {
	Node root;
	
	public Node insert(String value) {
		if(this.root == null) {
			this.root = new Node(value);
			return this.root;
		} else {
			return this.root.insert(value);
		}
	}
	
	public Node find(String value) {
		if(this.root == null) {
			return this.root;
		} else {
			return this.root.find(value);
		}
	}
	
	public void printTree() {
		printTree(this.root, 0);
	}
	
	private void printTree(Node currentNode, int indent) {
		System.out.println(padLeft(indent*2) + currentNode.value + ":");
		
		if(currentNode.left != null) {
			printTree(currentNode.left, indent+1);
		} else {
			System.out.println(padLeft((indent+1)*2) + "null:");
		}
		
		if(currentNode.right != null) {
			printTree(currentNode.right, indent+1);
		} else {
			System.out.println(padLeft((indent+1)*2) + "null:");
		}
		
	}
	
	public static String padLeft(int pad) {
		if(pad == 0) {
			return "";
		} else {
			return String.format("%1$" + pad + "s", "");
		}
	}
}
