// Last updated: 8/1/2025, 7:02:03 AM
class Solution {
    public boolean isBalanced(String num) {
        int se=0;
        int so=0;
        for (int i=0;i<num.length();i++){
            if (i%2==0){
                se+=num.charAt(i)-'0';
            }
            else{
                so+=num.charAt(i)-'0';
            }
        }
        return se==so;
    }
}