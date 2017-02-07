# Recursive Linear Search

Procedure: Recursive Linear Search (A, i, x):

Inputs: Save as linearSearch but with added parameter i.
Output: The index of an element matching x in the subarray from A[i]
        through A[n], or -1 if x is not found in the array
        
Steps:
1. If i > n then return -1
2. else if a[i] == x then return i
3. else recur(a, i+1, x)  