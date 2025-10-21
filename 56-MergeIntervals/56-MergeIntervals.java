// Last updated: 10/21/2025, 1:07:44 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->{
            if (a[0]!=b[0]){
                return a[0]-b[0];
            }
            else{
                return a[1]-b[1];
            }
        });
        List<List<Integer>> tempLs = new ArrayList<>();
        List<Integer> tempIntLs = new ArrayList<>();
        tempIntLs.add(intervals[0][0]);
        tempIntLs.add(intervals[0][1]);
        tempLs.add(tempIntLs);
        for (int i=1 ; i<n ; i++){
            int prevSt = tempLs.get(tempLs.size()-1).get(0);
            int prevEnd = tempLs.get(tempLs.size()-1).get(1);
            if (intervals[i][0]>prevEnd){
                tempIntLs = new ArrayList<>();
                tempIntLs.add(intervals[i][0]);
                tempIntLs.add(intervals[i][1]);
                tempLs.add(tempIntLs);
            }
            else{
                tempLs.get(tempLs.size()-1).set(0,prevSt);
                tempLs.get(tempLs.size()-1).set(1,Math.max(prevEnd,intervals[i][1]));

            }

	    }
        int[][] ans = new int[tempLs.size()][2];
        int idx = 0;
        for (List<Integer> ls : tempLs){
            ans[idx][0] = ls.get(0);
            ans[idx][1] = ls.get(1);
            idx++;
        }
        return ans;
    }
}