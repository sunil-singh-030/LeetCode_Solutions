// Last updated: 5/31/2026, 2:21:02 PM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        Arrays.sort(asteroids);
4        long currMass = mass;
5        for (int ast : asteroids){
6            if (ast>currMass){
7                return false;
8            }
9            currMass += ast;
10        }
11        return true;
12    }
13}