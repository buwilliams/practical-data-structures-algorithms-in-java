# Insertion Sort

## Description

Insertion Sort is an algorithm which splits data into two arrays, one of the left (sorted array) and one on the right (unsorted array.) The process is to move one element from right unsorted array to the left sorted array. Once moved in the sorted array it shoves elements to the right until it find a sorted home. This process is repeated until the last element is reached.

This algorithm has a Big O Notation of O(n^2) since there is one nested loops.

## Pseudo Code

Procedure: Insertion-Sort(A)

- Inputs: A = an array to be sorted
- Outputs: A sorted in ascending order

Steps:

- for i = 1 to A.length - 1
	- set element to A[i], and set j to i - 1
	- while j >= 0 and A[j] > element:
		- set A[j + 1] to A[j]
		- decrement j by 1
	- set A[j + 1] to element
	
	
