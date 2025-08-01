// Last updated: 8/1/2025, 7:05:57 AM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for (int i=1 ; i<n ; i++){
            mindiff = Math.min(mindiff,Math.abs(arr[i]-arr[i-1]));
        }
        List<List<Integer>> ls = new ArrayList<>();
        for (int i=1 ; i<n ; i++){
            if (Math.abs(arr[i]-arr[i-1])==mindiff){
                List<Integer> ls1 = new ArrayList<>();
                ls1.add(arr[i-1]);
                ls1.add(arr[i]);
                ls.add(ls1);
            }
        }
        return ls;
    }
}