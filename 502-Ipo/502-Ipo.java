// Last updated: 12/19/2025, 12:00:35 PM
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] arr = new int[n][2];
        for (int i=0 ; i<n ; i++){
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }
        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b) -> b[1]-a[1]);
        for (int i=0 ; i<arr.length ;){
            while (i<arr.length && w>=arr[i][0]){
                pq.add(arr[i]);
                i++;
            }
            if (pq.isEmpty() || k==0){
                return w;
            }
            w += pq.poll()[1];
            k--;
        }
        while (pq.size()>0 && k>0){
            k--;
            w += pq.poll()[1];
        }
        return w;
    }
}