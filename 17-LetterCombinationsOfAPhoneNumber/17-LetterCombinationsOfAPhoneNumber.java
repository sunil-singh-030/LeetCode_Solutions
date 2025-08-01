// Last updated: 8/1/2025, 7:12:56 AM
class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> ls=new ArrayList<>();
        if(digits.length()==0){
            return ls;
        }
        gen_com(ls,digits,"");
        return ls;
    }
    public static void gen_com(List<String> ls,String digits,String ans){
        if (digits.length()==0){
            ls.add(ans);
            return;
        }
        char ch=digits.charAt(0);
        String getstr=key[ch-'0'];
        for (int i=0;i<getstr.length();i++) {
			gen_com(ls,digits.substring(1),ans+getstr.charAt(i));
		}
    }
}