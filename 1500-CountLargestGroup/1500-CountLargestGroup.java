// Last updated: 8/1/2025, 7:05:35 AM
class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=1 ; i<=n ; i++){
            int sum = 0;
            int num = i;
            while (num>0){
                sum += (num%10);
                num /= 10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int max = 0;
        for (int val : map.values()){
            max = Math.max(max,val);
        }
        int cnt = 0;
        for (int val : map.values()){
            if (val==max){
                cnt++;
            }
        }
        return cnt;
    }
}