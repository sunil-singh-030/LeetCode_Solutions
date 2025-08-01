// Last updated: 8/1/2025, 7:04:54 AM
class Solution {
    public int minDeletions(String s) {
        int [] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=1;
        }
        Arrays.sort(arr);

        boolean [] ar=new boolean[arr[25]+1];
        int c=0;
        int min=-1;
        for (int i=0;i<26;i++){
            if (arr[i]>0){
                min=i;
                break;
            }
        }
        for(int i=min;i<26;i++){
            int index=arr[i];
            if (ar[index]){
                boolean flag=true;
                for(int j=index;j>=0;j--){
                    if (ar[j]==false){
                        c+=(index-j);
                        ar[j]=true;
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    c+=index;
                }
            }
            else{
                ar[index]=true;
            }
        }
        return c;
    }
}