// Last updated: 8/1/2025, 7:04:39 AM
class Solution {
    public int[] minOperations(String boxes) {
        int [] arr=new int[boxes.length()];
        int c=0;
        int s=0;
        arr[0]=0;
        for (int i=1;i<boxes.length();i++){
            if (boxes.charAt(i-1)=='1'){
                c++;
            }
            s+=c;
            arr[i]=s;
        }
        s=0;
        c=0;
        for (int i=boxes.length()-2;i>=0;i--){
            if (boxes.charAt(i+1)=='1'){
                c++;
            }
            s+=c;
            arr[i]+=s;
        }
        return arr;
    }
}