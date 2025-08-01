// Last updated: 8/1/2025, 7:10:50 AM
class Solution {
    static List<List<String>> ls = new ArrayList<>();
    public List<List<String>> partition(String s) {
        ls.clear();
        partion(s,new ArrayList<>());
        return ls;
    }
    public static boolean ispalin(String str){
        for (int i=0 ; i<str.length()/2 ; i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void partion(String str , List<String> ans ){
        if (str.length()==0){
            ls.add(new ArrayList<>(ans));
            return;
        }
        for (int cut=1 ; cut<=str.length(); cut++) {
			String s = str.substring(0,cut);
			if (ispalin(s)) {
                ans.add(s);
				partion(str.substring(cut),ans);
                ans.remove(ans.size()-1);
			}
		}
        // for (int i=0 ; i<str.length() ; i++){
        //     String s = str.substring(0,i+1);
        //     if (ispalin(s)){
        //         ans.add(s);
        //         partion(str.substring(i+1),ans);
        //         ans.remove(String.valueOf(s));
        //     }
        // }
    }
}