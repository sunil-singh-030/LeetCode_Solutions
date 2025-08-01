// Last updated: 8/1/2025, 7:02:52 AM
class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n= nums.size();
        int ele = -1;
        for (int i=0 ; i<n ; i++){
            int num = nums.get(i);
            map.put(num,map.getOrDefault(num,0)+1);
            if (map.get(num)>n/2){
                ele = num;
                
            }
        }
        if (ele==-1){
            return -1;
        }
        //System.out.println(ele);
        int totalcnt = map.get(ele);
        int len = 0;
        int cnt = 0;
        for (int i=0 ; i<n ; i++){
            len++;
            if (nums.get(i)==ele){
                cnt++;
                if (cnt>len/2 && (totalcnt-cnt)>((n-len)/2)){
                    return i;
                }
            }
        }
        return -1;
    }
}