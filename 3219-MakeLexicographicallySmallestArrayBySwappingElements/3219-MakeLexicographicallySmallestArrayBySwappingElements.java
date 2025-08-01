// Last updated: 8/1/2025, 7:02:39 AM
class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int [] sortarr=nums.clone();
        Arrays.sort(sortarr);
        Map<Integer,Integer> value=new HashMap<>();
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> ls1=new ArrayList<>();
        ls1.add(sortarr[0]);
        value.put(sortarr[0],ls.size());
        for (int i=1;i<nums.length;i++){
            if (sortarr[i]-ls1.get(ls1.size()-1)<=limit){
                ls1.add(sortarr[i]);
                value.put(sortarr[i],ls.size());
            }
            else{
                ls.add(ls1);
                ls1=new ArrayList<>();
                ls1.add(sortarr[i]);
                value.put(sortarr[i],ls.size());
            }
        }
        ls.add(ls1);
        int [] out=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            out[i]=ls.get(value.get(nums[i])).get(0);
            ls.get(value.get(nums[i])).remove(0);
        }
        return out;
    }
}