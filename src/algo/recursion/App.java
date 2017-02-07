package algo.recursion;

public class App {

	public static void main(String[] args) {
		//reduceByOne(10);
		
		int[] ary = new int[]{1, 2, 3, 4, 5};
		
		// Recursive Linear Search
		//System.out.println(recursiveLinearSearch(ary, 0, 1));
		//System.out.println(recursiveLinearSearch(ary, 0, 3));
		//System.out.println(recursiveLinearSearch(ary, 0, 5));
		//System.out.println(recursiveLinearSearch(ary, 0, 6));
		
		// Recursive Binary Search
		System.out.println(recursiveBinarySearch(ary, 0, ary.length - 1, 1));
		System.out.println(recursiveBinarySearch(ary, 0, ary.length - 1, 5));
		System.out.println(recursiveBinarySearch(ary, 0, ary.length - 1, 3));
		System.out.println(recursiveBinarySearch(ary, 0, ary.length - 1, 6));
	}
	
	// Recursion uses the stack data structure
	public static void reduceByOne(int n) {
		if(n >= 0) reduceByOne(n - 1);
		
		System.out.println("Current n: " + n);
	}
	
	// Linear search using recursion
	public static int recursiveLinearSearch(int[] a, int i, int x) {
		if(i > a.length - 1) return -1;
		else if(a[i] == x) return i;
		else return recursiveLinearSearch(a, i + 1, x);
	}
	
	public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
		if(p > r) return -1; // base case
		
		int q = (p + r) / 2;
		
		if(a[q] > x) return recursiveBinarySearch(a, p, q-1, x);
		else if(a[q] < x) return recursiveBinarySearch(a, q+1, r, x);
		else return q;
	}

}
