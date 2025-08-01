// Last updated: 8/1/2025, 7:05:54 AM
class Solution {
    public int tupleSameProduct(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i<nums.length-1 ; i++){
            for (int j=i+1 ; j<nums.length ; j++){
                if (map.containsKey(nums[i]*nums[j])){
                    map.put(nums[i]*nums[j],map.get(nums[i]*nums[j])+1);
                }
                else{
                    map.put(nums[i]*nums[j],1);
                }
            }
        }
        int cnt = 0;
        // System.out.println(map);
        for (Integer value : map.values()){
            if (value>1){
                cnt += allpair(value);
                //System.out.println(value);
            }
        }
        return cnt;
    }
    public static int allpair(int value){
        int c1 = 1;
        for (int i=(value-2+1) ; i<=value ; i++){
            c1 *= i;
        }
        return c1*4;
    }
}