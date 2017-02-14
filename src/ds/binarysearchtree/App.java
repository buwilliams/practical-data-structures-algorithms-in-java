package ds.binarysearchtree;

public class App {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert("azy");
		bst.insert("buddy");
		bst.insert("casey");
		bst.insert("emma");
		bst.insert("isaac");
		bst.insert("mary");
		bst.insert("sally");
		
		bst.printTree();
	}

}
