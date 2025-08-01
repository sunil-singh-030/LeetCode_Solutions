// Last updated: 8/1/2025, 7:07:44 AM
class Solution {
    public int maximumSwap(int num) {
        // Convert the number to a string
        String numberStr = Integer.toString(num);

        // Create an array to hold the digits
        int[] digits = new int[numberStr.length()];

        // Convert each character to an integer and store it in the array
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        for (int i=0;i<digits.length;i++){
            int digit=digits[i];
            int max=-1;
            int ind=-1;
            for (int j=digits.length-1;j>i;j--){
                if (digits[j]>max){
                    max=digits[j];
                    ind=j;
                }
            }
            if (max>digit){
                digits[i]=max;
                digits[ind]=digit;
                break;
            }
        }
        String out="";
        for (int i=0;i<digits.length;i++){
            out+=String.valueOf(digits[i]);
        }
        // System.out.println(out);
        return Integer.valueOf(out);
    }
}