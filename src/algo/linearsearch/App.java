package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Answer: " + linearSearch(a, 10));
		System.out.println("Answer: " + linearSearch(a, 11));
	}
	
	// Linear growth rate, O(n) --> consider the worst case
	public static int linearSearch(int[] a, int x) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == x) return i;
		}
		return -1;
	}

}
