// Last updated: 8/1/2025, 7:02:25 AM
class Solution {
    public int countDays(int days, int[][] meetings) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int[] arr : meetings){
            int sd = arr[0];
            int ed = arr[1];
            if (!map.containsKey(sd)){
                pq.add(sd);
            }
            if (!map.containsKey(ed+1)){
                pq.add(ed+1);
            }
            map.put(sd,map.getOrDefault(sd,0)+1);
            map.put(ed+1,map.getOrDefault(ed+1,0)-1);
        }
        //System.out.println(map);
        int cnt = 0;
        int prev = 1;
        int sum = 0;
        while (pq.size()>0){
            int curr = pq.poll();
            if (sum==0 && curr>prev){
                cnt += (curr-prev);
            }
            sum += map.get(curr);
            prev = curr;
            //System.out.println(sum);
        }
        if (prev==days){
            if (sum==0){
                cnt++;
            }
        }
        else if (prev<days){
            cnt += (days-prev+1);
        }
        return cnt;
        
    }
}