// Last updated: 9/27/2025, 6:24:56 AM
class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points,(a,b) -> {
            if (a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            else{
                return Integer.compare(a[1],b[1]);
            }
            
        });
        int st = -1;
        int end = -1;
        int cnt = 0;
        boolean flag = true;
        for (int i=1 ; i<n ; i++){
            int st1 = -1;
            int end1 = -1;
            if (points[i-1][1]>=points[i][0]){
                if (points[i][0]<=points[i-1][1]){
                    st1 = Math.min(points[i-1][1],points[i][0]);
                    end1 = Math.min(points[i][1],points[i-1][1]);
                }
            }
            
            if (st==-1){
                if (st1==-1){
                    cnt++;
                }
                else{
                    cnt++;
                    st = st1;
                    end = end1;
                }
            }
            else {
                if (st1==-1){
                    
                    st = -1;
                    end = -1;
                }
                else{
                    if (st1>end){
                        st = points[i][0];
                        end = points[i][1];
                        cnt++;
                    }
                    else{
                        st = Math.max(st,st1);
                        end = Math.min(end,end1);
                    }
                }
                
            }
            // System.out.println(i+" "+cnt);
            // System.out.println(st+" "+end);
            // System.out.println(st1+" "+end1);

        }
        if (st==-1){
            cnt++;
        }
        return cnt;
    }
}