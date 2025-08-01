// Last updated: 8/1/2025, 7:00:49 AM
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key : map.keySet()){
            int val = map.get(key);
            boolean flag = true;
            if (val==2){
                return true;
            }
            if (val==1){
                continue;
            }
            for (int i=2 ; i<=Math.sqrt(val) ; i++){
                if (val%i==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                return true;
            }
        }
        return false;
    }
}