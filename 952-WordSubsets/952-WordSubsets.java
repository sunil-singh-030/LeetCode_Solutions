// Last updated: 8/1/2025, 7:06:41 AM
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ls=new ArrayList<String>();

        int [] arr=new int[26];
        for (int i=0;i<words2.length;i++){
            String str=words2[i];
            int [] temp=new int[26];
            for (int j=0;j<str.length();j++){
                temp[str.charAt(j)-'a']++;
            }
            for (int k=0;k<26;k++){
                arr[k]=Math.max(arr[k],temp[k]);
            }
        }
        for (int i=0;i<words1.length;i++){
            String str=words1[i];
            int [] check=new int[26];
            for (int j=0;j<str.length();j++){
                check[str.charAt(j)-'a']++;
            }
            boolean flag=true;
            for (int k=0;k<26;k++){
                if (arr[k]>check[k]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                ls.add(str);
            } 
        }
        // for (int i:arr){
        //     System.out.println(i);
        // }
        return ls;
    }
}