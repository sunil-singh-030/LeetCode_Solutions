// Last updated: 12/19/2025, 11:54:24 AM
class Solution {
    public int[] decimalRepresentation(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        char[] arr = s.toCharArray();
        List<Integer> ls = new ArrayList<>();
        int zero = len-1;
        for (char ch : arr){
            if (ch!='0'){
                ls.add((ch-'0')*((int)Math.pow(10,zero)));
            }
            zero--;
        }
        int[] ans = new int[ls.size()];
        int ind = 0;
        for (int num : ls){
            ans[ind] = num;
            ind++;
        }
        return ans;
    }
}