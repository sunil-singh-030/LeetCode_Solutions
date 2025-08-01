// Last updated: 8/1/2025, 7:03:11 AM
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        return ispainted(arr,mat);
    }
    public static int ispainted(int[] arr, int[][] mat) {
        int [] freq1=new int[arr.length+1];
        int [] freq2=new int[arr.length+1];
        for (int row=0;row<mat.length;row++){
            int left=0;
            int right=mat[0].length-1;
            while (left<=right){
                int num1=mat[row][left];
                int num2=mat[row][right];
                freq1[num1]=row;
                freq1[num2]=row;
                freq2[num1]=left;
                freq2[num2]=right;
                left++;
                right--;
            }
        }
        int [] countrow=new int[mat.length];
        int [] countcol=new int[mat[0].length];
        int out=-1;
        for (int ind=0;ind<arr.length;ind++){
            countrow[freq1[arr[ind]]]++;
            if(countrow[freq1[arr[ind]]]==mat[0].length){
                out=ind;
                break;
            }
            countcol[freq2[arr[ind]]]++;
            if(countcol[freq2[arr[ind]]]==mat.length){
                out=ind;
                break;
            }
        }
        return out;
    }
}