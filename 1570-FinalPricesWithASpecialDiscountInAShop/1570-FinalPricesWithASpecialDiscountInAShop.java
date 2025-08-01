// Last updated: 8/1/2025, 7:05:22 AM
class Solution {
    public int[] finalPrices(int[] prices) {
        int [] arr=new int[prices.length];
        for (int i=0;i<prices.length;i++){
            int num=prices[i];
            for (int j=i+1;j<prices.length;j++){
                if (prices[j]<=prices[i]){
                    num-=prices[j];
                    break;
                }
            }
            arr[i]=num;
        }
        return arr;
    }
}