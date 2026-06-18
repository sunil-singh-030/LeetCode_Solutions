// Last updated: 6/18/2026, 6:41:50 AM
1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double hrMin = hour*5;
4        if (hour==12){
5            hrMin = 0;
6        }
7        double minMin = (double) minutes;
8        hrMin += 5*(minMin/60.0);
9
10        double diff = Math.abs(hrMin-minMin);
11        double angle = diff*6;
12        return Math.min(angle,360-angle);
13    }
14}