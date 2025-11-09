// Last updated: 11/9/2025, 12:31:35 PM
class Solution {
    public int countOperations(int num1, int num2) {
        int cntOp = 0;
        while (num1!=0 && num2!=0){
            if (num1>=num2){
                num1 -= num2;
            }
            else{
                num2 -= num1;
            }

            cntOp++;
        }
        return cntOp;
    }
}