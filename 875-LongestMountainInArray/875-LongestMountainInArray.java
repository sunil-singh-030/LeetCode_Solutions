// Last updated: 8/1/2025, 7:07:10 AM
class Solution {
    public int longestMountain(int[] arr) {
        int max=0;
        for (int i=1;i<arr.length-1;i++){
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int c=3;
                for (int j=i-2;j>=0;j--){
                    if (arr[j]<arr[j+1]){
                        c++;
                    }
                    else{
                        break;
                    }
                }
                for(int j=i+2;j<arr.length;j++){
                    if (arr[j]<arr[j-1]){
                        c++;
                    }
                    else{
                        break;
                    }
                }
                max=Math.max(max,c);
            }
            // System.out.print(max);
            // System.out.println();
        }
        return max;
    }
}