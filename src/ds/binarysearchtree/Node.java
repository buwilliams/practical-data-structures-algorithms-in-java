package ds.binarysearchtree;

public class Node {
	Node left;
	Node right;
	String value;
	
	public Node(String value) {
		this.value = value;
	}
	
	public Node insert(String value) {
		if(isLessThanOrEqualTo(value)) {
			if(this.left == null) {
				this.left = new Node(value);
				return this.left;
			} else {
				return this.left.insert(value);
			}
		} else {
			if(this.right == null) {
				this.right = new Node(value);
				return this.right;
			} else {
				return this.right.insert(value);
			}
		}
	}
	
	public Node find(String value) {
		if(this.value == value) {
			return this;
		} else {
			if(isLessThanOrEqualTo(value)) {
				return this.left.find(value);
			} else {
				return this.right.find(value);
			}
		}
	}
	
	public boolean isLessThanOrEqualTo(String value) {
		int compare = value.compareTo(this.value); 
		if(compare <= 0) {
			return true;
		} else {
			return false;
		}
	}
}
