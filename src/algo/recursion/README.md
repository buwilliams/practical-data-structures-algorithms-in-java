# Recursive Linear Search

## Recursive Linear Search

Procedure: Recursive Linear Search (A, i, x):

Inputs: Save as linearSearch but with added parameter i.
Output: The index of an element matching x in the subarray from A[i]
        through A[n], or -1 if x is not found in the array
        
Steps:
1. If i > n then return -1
2. else if a[i] == x then return i
3. else recur(a, i+1, x)

## Recursive Binary Search

Procedure: Recursive Binary Search

Inputs: a = int[], p = start index, r = end index, x = search value 
Outputs: returns p if a[p] == x  or -1 if value not found

Steps:
1. if p > r return -1 (base case)
2. q = (p + r) / 2
3. if a[q] > x then return recur(a, p, q-1, x)
4. else if a[q] < x then return recur(a, p+1, r, x)
5. else return p


