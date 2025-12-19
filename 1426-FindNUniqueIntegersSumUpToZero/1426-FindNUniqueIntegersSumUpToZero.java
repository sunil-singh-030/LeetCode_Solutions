// Last updated: 12/19/2025, 11:58:37 AM
class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n%2==0){
            int num = -1;
            for (int i=0 ; i<n/2 ; i++){
                arr[i] = num;
                num--;
            }
            num = 1;
            for (int i=n/2 ; i<n ; i++){
                arr[i] = num;
                num++;
            }
        }
        else{
            int num = -1;
            for (int i=0 ; i<n/2 ; i++){
                arr[i] = num;
                num--;
            }
            num = 1;
            for (int i=(n/2)+1 ; i<n ; i++){
                arr[i] = num;
                num++;
            }
        }
        return arr;
    }
}