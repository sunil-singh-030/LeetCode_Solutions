// Last updated: 8/1/2025, 7:08:53 AM
class Solution {
    public char findTheDifference(String s, String t) {
        String str=s;
        //String str="nitin";
		int [] arr=new int[26];
		for (int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'a']+=1;
		}
        int [] arr1=new int[26];
		for (int i=0;i<t.length();i++) {
			arr1[t.charAt(i)-'a']+=1;
		}
        char ch='_';
        for (int i=0;i<26;i++){
            if (arr1[i]>arr[i]){
                ch= (char) (97+i);
                break;
            }
        }
        return ch;
        
    }
}