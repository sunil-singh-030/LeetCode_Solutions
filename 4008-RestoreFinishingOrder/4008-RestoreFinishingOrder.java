// Last updated: 9/10/2025, 12:10:05 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        HashSet<Integer> set = new HashSet<>();
        for (int num : friends){
            set.add(num);
        }
        int ind = 0;
        for (int i=0 ; i<order.length ; i++){
            if (set.contains(order[i])){
                ans[ind] = order[i];
                ind++;
            }
        }
        return ans;
    }
}