// Last updated: 8/1/2025, 7:04:14 AM
class Solution {
    public int minOperations(int[][] grid, int x) {
        int rem = -1;
        List<Integer> ls = new ArrayList<>();
        for (int[] arr : grid){
            for (int num : arr){
                ls.add(num);
                if (rem!=-1){
                    if (rem!=(num%x)){
                        return -1;
                    }
                    
                }
                else{
                    rem = num%x;
                }
            }
        }
        Collections.sort(ls);
        //System.out.println(ls);
        int target = ls.get(ls.size()/2);
        int cnt = 0;
        for (int i=0 ; i<ls.size() ; i++){
            cnt += (Math.abs(ls.get(i)-target)/x);
        }
        return cnt;
        
        

    }
}