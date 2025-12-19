// Last updated: 12/19/2025, 11:54:08 AM
class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        long ans = 0;
        int n = technique1.length;
        int[][] arr = new int[n][2];
        for (int i=0 ; i<n ; i++){
            arr[i][0] = technique1[i]-technique2[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        // for (int i=0 ; i<n ; i++){
        //     System.out.println(arr[i][0]+" "+arr[i][1]);
        // }
        for (int i=0 ; i<k ; i++){
            ans += technique1[arr[i][1]];
        }
        for (int i=k ; i<n ; i++){
            ans += Math.max(technique1[arr[i][1]],technique2[arr[i][1]]);
        }
        
        return ans;
        
        
    }
    
    
}