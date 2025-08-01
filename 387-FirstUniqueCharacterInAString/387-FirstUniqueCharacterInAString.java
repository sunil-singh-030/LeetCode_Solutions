// Last updated: 8/1/2025, 7:08:54 AM
class Solution {
    public int firstUniqChar(String s) {
        String str=s;
        //String str="nitin";
		int [] arr=new int[26];
		for (int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'a']+=1;
		}
        for (int i=0;i<str.length();i++){
            if (arr[str.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
        
    }
}