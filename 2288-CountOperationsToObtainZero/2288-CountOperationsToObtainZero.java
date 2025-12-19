// Last updated: 12/19/2025, 11:57:04 AM
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