// Last updated: 8/13/2025, 11:58:47 AM
class Solution {
    public long maxTotal(int[] value, int[] limit) {
        long ans = 0;
        int n = limit.length;
        int[][] arr = new int[n][2];
        for (int i=0 ; i<n ; i++){
            arr[i][0] = value[i];
            arr[i][1] = limit[i];
        }
        Arrays.sort(arr, (x,y) -> {
            if (x[1]!=y[1]){
                return Integer.compare(x[1],y[1]);
            }
            else{
                return Integer.compare(y[0],x[0]);
            }
        });
        int cnt = 0;
        boolean[] flag = new boolean[n];
        List<Integer> ls = new ArrayList<>();
        int stIndex = 0;
        for (int i=0 ; i<n ; i++){
            if (cnt<arr[i][1]){
                ls.add(arr[i][1]);
                ans += arr[i][0];
                cnt++;
            }
            
            int st = i+1;
            int end = n-1;
            int ind = n;
            while (st<=end){
                int mid = (st+end)/2;
                if (arr[mid][1]>cnt){
                    ind = mid;
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            
            ind--;
            i = ind;
            int stInd = stIndex;
            int endInd = ls.size()-1;
            int tar = -1;
            while (stInd<=endInd){
                int mid = (stInd+endInd)/2;
                if (ls.get(mid)<=cnt){
                    tar = mid;
                    stInd = mid+1;
                }
                else{
                    endInd = mid-1;
                }
            }
            if (tar!=-1){
                cnt -= (tar-stIndex+1);
                stIndex = tar+1;
                if (stIndex==ls.size()){
                    stIndex = 0;
                    ls = new ArrayList<>();
                }
            }
        }
        return ans;
    }
}