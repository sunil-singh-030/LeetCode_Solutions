// Last updated: 12/19/2025, 11:58:34 AM
class Solution {
    public int maximum69Number (int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i]=='6'){
                arr[i] = '9';
                break;
            }
        }
        String s = "";
        for (char ch : arr){
            s += ch;
        }
        return Integer.parseInt(s);
    }
}