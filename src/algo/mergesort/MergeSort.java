package algo.mergesort;

public class MergeSort {

	public static void sort(int[] inputArray) {
		sort(inputArray, 0, inputArray.length - 1);
	}
	
	public static void sort(int[] inputArray, int start, int end) {
		if(start >= end) return;
		
		int mid = (start + end) / 2;
		
		sort(inputArray, start, mid);
		sort(inputArray, mid+1, end);
		merge(inputArray, start, mid, end);
	}
	
	public static void merge(int[] inputArray, int start, int mid, int end) {
		int[] tempArray = new int[end - start + 1];
		
		int left = start;
		int right = mid+1;
		int k = 0;
		
		while(left <= mid && right <= end) {
			if(inputArray[left] < inputArray[right]) {
				tempArray[k] = inputArray[left];
				left++;
			} else {
				tempArray[k] = inputArray[right];
				right++;
			}
			k++;
		}
		
		if(left <= mid) {
			while(left <= mid) {
				tempArray[k] = inputArray[left];
				left++;
				k++;
			}
		} else if(right <= end) {
			while(right <= end) {
				tempArray[k] = inputArray[right];
				right++;
				k++;
			}
		}
		
		for(int i=0; i<tempArray.length; i++)
			inputArray[start+i] = tempArray[i];
	}
}
