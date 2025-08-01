// Last updated: 8/1/2025, 7:04:47 AM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> b[1]-a[1]);
        int cnt = 0;
        for (int[] arr : boxTypes){
            int boxcnt = arr[0];
            int unit = arr[1];
            cnt += unit*(Math.min(boxcnt,truckSize));
            truckSize -= boxcnt;
            if (truckSize<=0){
                return cnt;
            }
            //System.out.println(cnt+" "+truckSize);
        }
        return cnt;
    }
}