package algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int[] myAry = new int[]{12, 4, 1, 10, 2, 5};
		printArray(insertionSort(myAry));
	}
	
	public static int[] insertionSort(int[] a) {
		for(int i = 1; i<a.length; i++) { // i = unsorted array index
			int element = a[i];
			int j = i - 1; // sorted array index
			while(j >= 0 && a[j] > element) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = element;
		}
		return a;
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
