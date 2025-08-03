// Last updated: 8/3/2025, 9:55:11 PM
class Solution {
    public int minTime(String s, int[] order, int k) {
        int n = s.length();
        List<Integer> ls = new ArrayList<>();
        long cntvalidStr = 0;
        long req = (long) k;
        int ans = 0;
        for (int index : order){
            int indstar = -1;
            int st = 0;
            int end = ls.size()-1;
            while (st<=end){
                int mid = (st+end)/2;
                int pos = ls.get(mid);
                if (pos<index){
                    indstar = mid;
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            if (indstar==-1){
                if (ls.size()>0){
                    cntvalidStr += count(0,ls.get(0)-1,index);
                    ls.add(0,index);
                }
                else{
                    cntvalidStr += count(0,n-1,index);
                    ls.add(index);
                }
            }
            else{
                if (indstar==ls.size()-1){
                    cntvalidStr += count(ls.get(ls.size()-1)+1,n-1,index);
                    ls.add(index);
                }
                else{
                    cntvalidStr += count(ls.get(indstar)+1,ls.get(indstar+1)-1,index);
                    ls.add(indstar+1,index);
                }
            }
            if (cntvalidStr>=req){
                return ans;
            }
            ans++;
        }
        return -1;
    }
    public static long count(int st, int end, int curr){
        long cnt = 0;
        cnt += (curr-st+1);
        cnt += (end-curr);
        cnt += ((long) (curr-st)) * (end-curr);
        return cnt;
    }
}