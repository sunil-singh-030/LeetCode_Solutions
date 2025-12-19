// Last updated: 12/19/2025, 11:55:58 AM
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] out = new int[n-k+1];
        int idx = 0;
        int[] freq = new int[51];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i<k ; i++){
            freq[nums[i]]++;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            if (freq[a]!=freq[b]){
                return freq[b]-freq[a];
            }
            else{
                return b-a;
            }
        });
        for (int num : map.keySet()){
            pq.offer(num);
        }
        int temp = x;
        int sum = 0;
        while (temp-->0 && !pq.isEmpty()){
            int num = pq.poll();
            sum += freq[num]*num;
        }
        out[idx] = sum;
        idx++;
        for (int i=k ; i<n ; i++){
            freq[nums[i-k]]--;
            freq[nums[i]]++;
            map.put(nums[i-k],map.get(nums[i-k])-1);
            if (map.get(nums[i-k])==0){
                map.remove(nums[i-k]);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            pq = new PriorityQueue<>((a,b)->{
                if (freq[a]!=freq[b]){
                    return freq[b]-freq[a];
                }
                else{
                    return b-a;
                }
            });
            for (int num : map.keySet()){
                pq.offer(num);
            }
            temp = x;
            sum = 0;
            while (temp-->0 && !pq.isEmpty()){
                int num = pq.poll();
                sum += freq[num]*num;
            }
            out[idx] = sum;
            idx++;
        }
        return out;
    }
}