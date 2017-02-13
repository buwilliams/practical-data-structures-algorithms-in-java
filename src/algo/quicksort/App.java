package algo.quicksort;

public class App {

	public static void main(String[] args) {
		//int[] myAry = new int[]{9, 3, 1, 2, 5, 4, 8};
		//int[] myAry = new int[]{8,9};
		//int[] myAry = new int[]{9};
		int[] myAry = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
		QuickSort.sort(myAry);
		QuickSort.printArray(myAry);
	}
	
}
