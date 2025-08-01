// Last updated: 8/1/2025, 7:05:40 AM
class Solution {
    public int[] sortByBits(int[] arr) {
        int[] newarr = new int [arr.length];

        for(int i=0; i<arr.length; i++){
            newarr[i] = countbit(arr[i])*10001 + arr[i];

        }
        Arrays.sort(newarr);

        for(int i=0; i<arr.length;i++){
            newarr[i] = newarr[i]%10001;
        }
        
        return newarr;

    }

    public int countbit(int n){
        int count =0; 
        while(n!=0){
            count = count+(n&1);
            n>>=1;
        }
        return count;
    }
}