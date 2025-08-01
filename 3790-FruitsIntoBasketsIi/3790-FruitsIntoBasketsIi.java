// Last updated: 8/1/2025, 7:01:22 AM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] flag = new boolean[baskets.length];
        int c=0;
        for (int i=0 ; i<fruits.length ; i++){
            int f = fruits[i];
            for (int j=0 ; j<baskets.length ; j++){
                if (f<=baskets[j] && !flag[j]){
                    c++;
                    flag[j] = true;
                    break;
                }
            }
        }
        return fruits.length-c;
    }
}