# Binary Search

In the book Programming Pearls, only 10% of candidates are able to implement binary search in a job interview.

In order for Binary Search to work the *data must be sorted*.

Big O notation for Binary Search is O(log n), fastest algorithm we have for searching through a list of sorted elements.

## Details

`[1][3][5][7][9][11][13][15][17][19]`
`0  1  2  3  4  5   6   7   8   9`
 
 Procedure: BinarySearch(a, x)
 
 p = first slot
 r = last slot
 q = middle slot
 
 A[p...r]
 
 Steps:
 
 1. Assign initial values: p = 0, r = a.length - 1
 2. while p <= r do:
 	- find mid-point: set q = L(p + r) / 2L (L = floor the value)
 	- does q equal the value we are search for: if A[q] == x then return q
 	- if A[q] > x, set r = q - 1
 	- else if A[q] < x, set p = r + 1
 3. return -1 