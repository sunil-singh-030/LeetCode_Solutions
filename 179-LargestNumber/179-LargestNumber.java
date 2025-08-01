// Last updated: 8/1/2025, 7:10:19 AM
class Solution {
    public String largestNumber(int[] nums) {
            int n=nums.length;
            int [] arr = nums;
            String [] ar =new String[n];
            for (int i=0;i<n;i++){
                ar[i]=String.valueOf(arr[i]);
            }
            sort(ar);
            String out = "";
            for (int i =0; i<n; i++) {
                out += ar[i];
            }

            if (out.charAt(0) == '0') {
                out = "0";
            }

            return out;
        
        
    }

    public static void sort(String[] arr) {
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length - turn; i++) {
                String c1 = arr[i] + arr[i + 1];
                String c2 = arr[i + 1] + arr[i];
                if (c2.compareTo(c1) > 0) { 
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
