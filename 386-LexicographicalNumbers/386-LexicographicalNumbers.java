// Last updated: 8/1/2025, 7:08:56 AM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ls=new ArrayList<>();
        gen_pair(n,0,ls);
        return ls;
    }
    public static void gen_pair(int n,int cur,List<Integer> ls){
        if (cur>n){
            return ;
        }
        if (cur!=0){
            ls.add(cur);
        }
        int i=0;
        if (cur==0){
            i=1;
        }
        for (;i<=9;i++){
            gen_pair(n,cur*10+i,ls);
        }
    }
}