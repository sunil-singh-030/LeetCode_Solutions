// Last updated: 8/1/2025, 7:08:09 AM
class Solution {
    public int findPairs(int[] nums, int k) {
        int cnt = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] arr = new int[map.size()];
        int ind = 0;
        for (int key : map.keySet()){
            arr[ind] = key;
            ind++;
            if (k==0 && map.get(key)>1){
                cnt++;
            }
        }
        Arrays.sort(arr);
        int n = arr.length;
        for (int i=0 ; i<n-1 ; i++){
            int req = k+arr[i];
            int left = i+1;
            int right = n-1;
            int si = -1;
            while (left<=right){
                int mid = (left+right)/2;
                if (arr[mid]==req){
                    si = mid;
                    right = mid-1;
                }
                else if (arr[mid]>req){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            //System.out.println(si);
            if (si==-1){
                continue;
            }
            left = i+1;
            right = n-1;
            int ei = -1;
            while (left<=right){
                int mid = (left+right)/2;
                if (arr[mid]==req){
                    ei = mid;
                    left = mid+1;
                }
                else if (arr[mid]>req){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            cnt += (ei-si+1);
            //System.out.println(cnt+" "+i); 
        }
        return cnt;
    }
}