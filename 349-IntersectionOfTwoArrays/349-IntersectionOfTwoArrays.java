// Last updated: 8/1/2025, 7:09:05 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ls1 = new ArrayList<>();
        for (int i=0 ; i<nums1.length ; i++){
            ls1.add(nums1[i]);
        }
        List<Integer> ls2 = new ArrayList<>();
        for (int i=0 ; i<nums2.length ; i++){
            ls2.add(nums2[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0 ; i<ls1.size() ; i++){
            int num = ls1.get(i);
            if (ls2.contains(num) && !ans.contains(num)){
                ans.add(num);
            }
        }
        int[] out = new int[ans.size()];
        for (int i=0 ; i<ans.size() ; i++){
            out[i] = ans.get(i);
        }
        return out;
    }
}