// Last updated: 8/1/2025, 7:01:05 AM
class Solution {
    public long maxArea(int[][] coords) {
        int n = coords.length;
        if (n<3){
            return -1;
        }
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (int i=0 ; i<n ; i++){
            s1.add(coords[i][0]);
            if (s1.size()==2){
                break;
            }
        }
        for (int i=0 ; i<n ; i++){
            s2.add(coords[i][1]);
            if (s2.size()==2){
                break;
            }
        }
        if (s1.size()==1 && s2.size()==1){
            return -1;
        }
        

        // case1
        int[][] a1 = coords.clone();
        Arrays.sort(a1,(a,b) -> {
            if (a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            else{
                return Integer.compare(a[1],b[1]);
            }
        });

        int minx = a1[0][0];
        int maxx = a1[n-1][0];
        long ans1 = 0;
        int ind = 0;
        int x = a1[0][0];
        int c = 0;
        boolean flag1 = false;
        for (int i=1 ; i<n ; i++ ){
            if (a1[i][0]==x){
                c++;
            }
            else{
                if (c>0){
                    int maxh = Math.max(a1[ind][0]-minx,maxx-a1[ind][0]);
                    flag1 = true;
                    ans1 =  Math.max(ans1,(long) (maxh)*(a1[i-1][1]-a1[ind][1]));
                }
                c = 0;
                ind = i;
                x = a1[i][0];
            }
        }
        if (c>0){
            int maxh = Math.max(a1[ind][0]-minx,maxx-a1[ind][0]);
            flag1 = true;
            ans1 = Math.max(ans1,(long) (maxh)*(a1[n-1][1]-a1[ind][1]));
        }
        if (s1.size()==1){
            flag1 = false;
        }
        a1 = coords.clone();
        //System.out.println(ans1);
        Arrays.sort(a1,(x1,y1) -> {
            if (x1[1]!=y1[1]){
                return Integer.compare(x1[1],y1[1]);
            }
            else{
                return Integer.compare(x1[0],y1[0]);
            }
        });
        long ans2 = 0;
        boolean flag2 = false;
        int y = a1[0][1];
        ind = 0;
        c = 0;
        for (int i=1 ; i<n ; i++){
            if (a1[i][1]==y){
                c++;
            }
            else{
                if (c>0){
                    flag2 = true;
                    int maxh = Math.max(a1[ind][1]-a1[0][1],a1[n-1][1]-a1[ind][1]);
                    //System.out.println("hi"+" "+maxh+" "+ind);
                    ans2 = Math.max(ans2,(long) (maxh)*(a1[i-1][0]-a1[ind][0]));
                }
                c = 0;
                ind = i;
                y = a1[i][1];
            }
        }
        //System.out.println(ans2);
        if (c>0){
            int maxh = Math.max(a1[ind][1]-a1[0][1],a1[n-1][1]-a1[ind][1]);
            flag2 = true;
            ans2  = Math.max(ans2, (long) (maxh)*(a1[n-1][0]-a1[ind][0]));
        }
        if (s2.size()==1){
            flag2 = false;
        }
        if (!flag1 && !flag2){
            return -1;
        }
        if (!flag1 && flag2){
            return ans2;
        }
        if (flag1 && !flag2){
            return ans1;
        }
        return Math.max(ans1,ans2);
    }
}