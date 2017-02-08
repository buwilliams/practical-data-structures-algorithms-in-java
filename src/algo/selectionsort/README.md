# Selection Sort

## Pseudo Code

Procedure: Selection-Sort(A)

- Inputs: A: an array to be sorted
- Outputs: A sorted in ascending order

Steps:

- for i = 0 to A.length - 1
	- Set minimum to i
	- For j = i + 1 to A.length
		- if A[j] < A[minimum]
			- then set minimum to j
	- Swap A[i] with A[minimum]