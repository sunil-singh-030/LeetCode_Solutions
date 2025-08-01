// Last updated: 8/1/2025, 7:10:38 AM
class Solution {
    public String reverseWords(String s) {
        String str=s;
        str=str.trim();
        String [] arr=str.split("\s+");
        String ans="";
		for (int i=arr.length-1;i>=0;i--) {
			ans+=arr[i]+" ";
		}
        ans=ans.trim();
        return ans;
    }
}