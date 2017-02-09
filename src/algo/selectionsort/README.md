# Selection Sort

## Description

This algorithm does a linear search through an array looking for the smallest item and swaps it with the first element. Next, the position to be swapped is incremented. Finally, the process is repeated until the end of the array is reached.

This algorithm has a growth rate (or complexity) of O(n^2) since there is one nested loop.

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