package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Answer: " + binarySearch(a, 2) + " = 1");
		System.out.println("Answer: " + binarySearch(a, 7) + " = 6");
	}
	
	public static int binarySearch(int[] a, int x) {
		int count = 0;
		int p = 0;
		int r = a.length;
		int q;
		
		while(p <= r) {
			System.out.println("Count: " + count++);
			q = (p + r) / 2;
			if(a[q] > x) r = q - 1;
			else if(a[q] < x) p = q + 1;
			else return q;
		}
		
		return -1;
	}

}
