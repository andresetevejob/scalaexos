# twoSum Algorithm

## Approche 1 Brute force solution
The brute force approach is simple. Loop through each element x and find if there is another value that equals to target−x.
Complexity Analysis

Time complexity : O(n^2)
. For each element, we try to find its complement by looping through the rest of array which takes O(n) time. Therefore, the time complexity is O(n^2)
Space complexity : O(1).

### Approche 2  HastTableSolution


### Approche 3 One-pass Hash Table
It turns out we can do it in one-pass. While we iterate and inserting elements into the table, we also look back to check if current element's complement already exists in the table. If it exists, we have found a solution and return immediately.
Complexity Analysis:

Time complexity : O(n). We traverse the list containing nn elements only once. Each look up in the table costs only O(1) time.

Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores at most nn elements.