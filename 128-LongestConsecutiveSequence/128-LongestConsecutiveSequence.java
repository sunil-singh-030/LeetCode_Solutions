// Last updated: 5/17/2026, 8:32:29 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> numSet = new HashSet<>();
4        for (int num : nums) {
5            numSet.add(num);
6        }
7
8        int longest = 0;
9
10        for (int num : numSet) {
11            if (!numSet.contains(num - 1)) {
12                int length = 1;
13
14                while (numSet.contains(num + length)) {
15                    length++;
16                }
17
18                longest = Math.max(longest, length);
19            }
20        }
21
22        return longest;        
23    }
24}