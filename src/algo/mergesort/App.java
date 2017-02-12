package algo.mergesort;

public class App {

	public static void main(String[] args) {
		int[] myAry = new int[]{12, 5, 8, 10, 2, 4, 6, 1, 11, 9, 7, 3};
		MergeSort.sort(myAry);
		printArray(myAry);
	}
	
	public static void printArray(int[] a) {
		String space = " ";
		System.out.print("{ ");
		for(int i=0; i<a.length; i++) {
			if (i == a.length - 1) space = "";
			System.out.print(a[i] + space);
		}
		System.out.println(" }");
	}
}
