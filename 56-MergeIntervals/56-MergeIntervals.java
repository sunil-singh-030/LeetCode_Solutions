// Last updated: 8/1/2025, 7:12:06 AM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
            if (a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            else{
                return Integer.compare(a[1],b[1]);
            }
        }
        );
        List<int[]> ls = new ArrayList<>();
        for (int i=1 ; i<intervals.length ; i++){
            int s2 = intervals[i][0];
            int s1 = intervals[i-1][0];
            int e2 = intervals[i][1];
            int e1 = intervals[i-1][1];
            if (e1>=s2){
                intervals[i][0] = s1;
                intervals[i][1] = Math.max(e1,e2);
            }
            else{
                ls.add(intervals[i-1]);
            }
        }
        ls.add(intervals[intervals.length-1]);
        int[][] out = new int[ls.size()][2];
        for (int i=0 ; i<ls.size() ; i++){
            out[i][0] = ls.get(i)[0];
            out[i][1] = ls.get(i)[1];
        }
        return out;
    }
}