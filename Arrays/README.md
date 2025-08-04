# Arrays Questions

This folder contains solutions to various array problems.

## Problems Solved

### 1. Intersection of Two Arrays
- **File**: `IntersectionOfTwoArrays.java`
- **Problem**: Find the intersection of two sorted arrays
- **Approach**: Two-pointer technique
- **Time Complexity**: O(n + m) where n and m are the lengths of the arrays
- **Space Complexity**: O(min(n, m)) for storing the result

#### Problem Description
Given two sorted arrays, find their intersection (common elements).

#### Example
```
Input: nums = [2,3,5,7,8,10], arr = [3,4,6,9,10]
Output: [3, 10]
```

#### Solution Approach
- Use two pointers to traverse both arrays
- Skip duplicates by checking previous elements
- If elements are equal, add to result and move both pointers
- If one element is smaller, move that pointer forward 