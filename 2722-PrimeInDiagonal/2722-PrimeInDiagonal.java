// Last updated: 8/1/2025, 7:03:02 AM
class Solution {
    public int diagonalPrime(int[][] nums) {
        int [][] mat=nums;
        int out=0;
        int row=0;
        int col=0;
        while (row<mat.length){
            if (isprime(mat[row][col])){
                out=Math.max(out,mat[row][col]);
            }
            row++;
            col++;
        }
        row=mat.length-1;
        col=0;
        while (col<mat.length){
            if (isprime(mat[row][col])){
                out=Math.max(out,mat[row][col]);
            }
            row--;
            col++;
        }
        return out;
    }
    public static boolean isprime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true; // 2 and 3 are prime numbers
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        // Only check up to the square root of n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}