// Last updated: 8/1/2025, 7:01:28 AM
class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for (int num : nums){
            ls.add(num);
        }
        int move = 0;
        boolean flag = true;
        while (flag){
            flag = false;
            int maxsum = 1000000;
            int ind = -1;
            for (int i=1 ; i<ls.size() ; i++){
                int sum = ls.get(i) + ls.get(i-1);
                if (ls.get(i)<ls.get(i-1)){
                    flag = true;
                }
                if (sum<maxsum){
                    maxsum = sum;
                    ind = i;
                }
                //System.out.println(maxsum+" "+i);
            }
            if (flag){
                ls.set(ind,maxsum);
                ls.remove(ind-1);
                move++;
            }
            //System.out.println(ls);
        }
        return move;
    }
}