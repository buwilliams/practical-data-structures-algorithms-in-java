# Quick Sort

Quick Sort has a worst case of O(n^2) and a best case of O(n log n). It's only better than Merge Sort in that it does in place swapping. Therefore, it does not require allocating additional memory.

## Pseudo Code

Method: QuickSort(A)

- Input: A = array to be sorted
- Output: A = sorted array in ascending order

```
QuickSort(A, p, r) {
	if(p < r) {
		q = partition(A, p, r);
		QuickSort(A, p, q-1);
		QuickSort(A, q+1, r);
	}
}
```