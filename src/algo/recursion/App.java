package algo.recursion;

public class App {

	public static void main(String[] args) {
		reduceByOne(10);
		
		int[] ary = new int[]{1, 2, 3, 4, 5};
		System.out.println(recursiveLinearSearch(ary, 0, 1));
		System.out.println(recursiveLinearSearch(ary, 0, 3));
		System.out.println(recursiveLinearSearch(ary, 0, 5));
		System.out.println(recursiveLinearSearch(ary, 0, 6));
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

}
