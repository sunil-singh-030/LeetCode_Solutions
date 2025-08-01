// Last updated: 8/1/2025, 7:09:51 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n1 = Integer.MIN_VALUE;
        int c1 = 0;
        int n2 = Integer.MIN_VALUE;
        int c2 = 0;
        for (int num : nums){
            if (num==n1){
                c1++;
            }
            else if (num==n2){
                c2++;
            }
            else if (c1==0){
                n1 = num;
                c1 = 1;
            }
            else if (c2==0){
                n2 = num;
                c2 = 1;
            }
            else{
                c1 -= 1;
                c2 -= 1;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int num : nums){
            if (num==n1) c1++;
            if (num==n2) c2++;
        }
        if (c1>(nums.length/3)){
            ls.add(n1);
        }
        if (c2>(nums.length/3)){
            ls.add(n2);
        }
        return ls;
    }
}