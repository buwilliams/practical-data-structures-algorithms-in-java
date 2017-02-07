# Procedure: Linear-Search(a, x)

## Inputs:

- a: the array to search in
- x: the value we are searching for in a

## Outputs:

- The index position where a[i] == x or -1 if not found

## Steps

1. Set answer to -1
2. For each index i going from 1 to n, in order
	- if a[i] == x, then set the answer to the value of i
3. Return the value of answer as the output