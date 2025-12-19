// Last updated: 12/19/2025, 11:56:19 AM
class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        int n = s.length();
        int l1 = a.length();
        int l2 = b.length();
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        for (int i=0 ; i<n ; i++){
            if (i+l1<=n){
                if (a.equals(s.substring(i,i+l1))){
                    ls1.add(i);
                }
            }
            if (i+l2<=n){
                if (b.equals(s.substring(i,i+l2))){
                    ls2.add(i);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int idx : ls1){
            int st = 0;
            int end = ls2.size()-1;
            boolean found = false;
            while (st<=end){
                int mid = (st+end)/2;
                if (ls2.get(mid)>idx){
                    end = mid-1;
                }
                else if (idx-ls2.get(mid)>k){
                    st = mid+1;
                }
                else{
                    found = true;
                    break;
                }
            }
            if (found){
                ans.add(idx);
            }
            else{
                st = 0;
                end = ls2.size()-1;
                while (st<=end){
                    int mid = (st+end)/2;
                    if (ls2.get(mid)<idx){
                        st = mid+1;
                    }
                    else if (ls2.get(mid)-idx>k){
                        end = mid-1;
                    }
                    else{
                        found = true;
                        break;
                    }
                }
                if (found){
                    ans.add(idx);
                }
            }
        }
        return ans;
    }
}