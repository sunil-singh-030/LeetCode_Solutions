// Last updated: 8/1/2025, 7:05:13 AM
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ls = new ArrayList<>();
        int remov = 0;
        for (int key : map.keySet()){
            ls.add(map.get(key));
        }
        int totaluniq = ls.size();
        Collections.sort(ls);
        for (int i=0 ; i<ls.size() ; i++){
            int val = ls.get(i);
            if (k>0 && val<=k){
                remov++;
                k -= val;
            }
            else{
                break;
            }
        }
        return totaluniq-remov;
    }
}