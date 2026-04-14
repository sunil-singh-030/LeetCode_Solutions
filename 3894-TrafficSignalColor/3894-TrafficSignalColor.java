// Last updated: 4/14/2026, 10:23:27 AM
1class Solution {
2    public String trafficSignal(int timer) {
3        if (timer==0) return "Green";
4        if (timer==30) return "Orange";
5        if (timer>30 && timer<=90) return "Red";
6        return "Invalid";
7    }
8}