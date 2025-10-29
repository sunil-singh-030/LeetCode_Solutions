// Last updated: 10/29/2025, 9:59:09 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int[][] visited = new int[m][n];
        fn(image,sr,sc,color,visited);
        return image;
    }
    public static void fn(int[][] image, int sr, int sc, int color,int[][] visited){
        if (visited[sr][sc]==1) return;
        visited[sr][sc] = 1;
        int[] r = {0,1,0,-1};
        int[] c = {1,0,-1,0};
        for (int i=0 ; i<4 ; i++){
            int newRow = sr + r[i];
            int newCol = sc + c[i];
            if (newRow<0 || newCol<0 || newRow>=image.length || newCol>=image[0].length){
                continue;
            }
            if (image[sr][sc]==image[newRow][newCol]){
                fn(image,newRow,newCol,color,visited);
            }
        }
        image[sr][sc] = color;
    }
}