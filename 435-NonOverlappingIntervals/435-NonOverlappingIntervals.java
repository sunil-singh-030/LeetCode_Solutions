// Last updated: 12/19/2025, 12:00:46 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals ,(a,b) -> Integer.compare(a[1],b[1]));
        int req = 0;
        int end = intervals[0][1];
        for (int i=1 ; i<n ; i++){
            if (intervals[i][0]<end){
                req++;
            }
            else{
                end = intervals[i][1];
            }
        }
        return req;
    }
}