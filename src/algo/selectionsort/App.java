package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int[] myAry = new int[]{5, 10, 7, 2, 6, 3, 13, 87, 99, 12, 1};
		int[] result = selectionSort(myAry);
		printArray(result);
	}
	
	public static int[] selectionSort(int[] a) {
		for(int i=0; i<a.length; i++) {
			int minimum = i;
			
			for(int j = i + 1; j<a.length; j++)
				if(a[j] < a[minimum]) minimum = j;
			
			if(i != minimum) {
				int tmp = a[i];
				a[i] = a[minimum];
				a[minimum] = tmp;
			}
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
