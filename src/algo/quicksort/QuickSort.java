package algo.quicksort;

public class QuickSort {
	public static void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}
	
	public static void sort(int[] a, int start, int end) {
		if(start < end) {
			int q = partition(a, start, end);
			//System.out.println("Partition: a["+q+"]="+a[q]);
			sort(a, start, q - 1);
			sort(a, q + 1, end);
		}
	}
	
	public static int partition(int[] a, int start, int end) {
		int i = start - 1;
		int j = start;
		
		while(j <= end) {
			if(a[j] <= a[end]) {
				i++;
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
			j++;
		}
		
		//printArray(a);
		
		return i;
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
