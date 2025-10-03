// Last updated: 10/3/2025, 10:46:31 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> out=new ArrayList<>();
        gen_pair(n,0,0,"",out);
        return out;
    }
    public static void gen_pair(int n,int open,int close,String str,List<String> out){
        if (open==n && close==n){
            out.add(str);
            //System.out.println(str);
            return; 
        }
        if (open>n || close>n){
            return;
        }
        if (open<close){
            return;
        }
        gen_pair(n,open+1,close,str+"(",out);
        gen_pair(n,open,close+1,str+")",out);
    }
}