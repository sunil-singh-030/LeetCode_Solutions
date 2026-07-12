// Last updated: 7/12/2026, 11:38:26 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String[] a1 = startTime.split(":");
4        String[] a2 = endTime.split(":");
5        int sec = 0;
6        sec += Integer.parseInt(a2[2])-Integer.parseInt(a1[2]);
7        sec += 60*(Integer.parseInt(a2[1])-Integer.parseInt(a1[1]));
8        sec += 3600*(Integer.parseInt(a2[0])-Integer.parseInt(a1[0]));
9        return sec;
10        
11    }
12}