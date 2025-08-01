// Last updated: 8/1/2025, 7:07:19 AM
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Arrays.sort(words);
        int count=0;
        boolean flag=true;
        String check="";

        for (String str:words){
            if (str.contains(check) && flag==false){
                continue;
            }
            flag=false;
            int i=0,j=str.length()-1;
            int left=0,right=s.length()-1;
            int c=0;
            while (left<=right){
                
                if (s.charAt(left)==str.charAt(i)){
                    i++;
                    c++;
                }
                if (s.charAt(right)==str.charAt(j)){
                    j--;
                    c++;
                }
                if (c>=str.length()){
                    flag=true;
                    break;
                }
                left++;
                right--;
            }
            if (flag){
                check=str;
                count++;
            }
            check=str;
        }
        return count;
    }
    
}