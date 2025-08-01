// Last updated: 8/1/2025, 7:07:15 AM
class Solution {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        boolean [] flag=new boolean[ages.length];
        int count=0;
        for (int i=ages.length-1;i>=1;i--){
            int check1= (int) (ages[i]*0.5 + 7);
            int ind1=-1;
            int left=0;
            int right=i-1;
            while (left<=right){
                int mid=(left+right)/2;
                if (ages[mid]<=check1){
                    left=mid+1;
                }
                else{
                    ind1=mid;
                    right=mid-1;
                }
            }
            if (ind1!=-1){
                flag[i]=true;
                count+=i-ind1;
            }
            //System.out.println(ind1+" "+count);
        }
        int ele=ages[0];
        int c=1;
        for (int i=1;i<ages.length;i++){
            if (ages[i]==ele){
                c++;
            }
            else{
                if(c>1 && flag[i-1]){
                    count+=(c*(c-1)/2);
                }
                ele=ages[i];
                c=1;
            }
        }
        if (c>1 && flag[ages.length-1]){
            count+=(c*(c-1)/2);
        }
        return count;
    }
}