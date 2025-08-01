// Last updated: 8/1/2025, 7:06:45 AM
class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length<3){
            return fruits.length;
        }
        int max=2;
        int f1=-1;
        int f2=-1;
        int c=0;
        int ind1=-1;
        int ind2=-1;
        boolean flag=true;
        for (int i=0;i<fruits.length;i++){
            if (f1==-1 && f2==-1){
                f1=fruits[i];
                flag=false;
            }
            if (flag){
                if(f1!=-1 && f2==-1 && fruits[i]!=f1){
                f2=fruits[i];
            }
            if(f1!=-1 && f2!=-1 && fruits[i]!=f1 && fruits[i]!=f2){
                if(ind1>ind2){
                    f2=fruits[i];
                }
                else{
                    f1=f2;
                    f2=fruits[i];
                    int temp=ind1;
                    ind1=ind2;
                    ind2=temp;
                }
                max=Math.max(max,c);
                c=Math.max(ind1,ind2)-Math.min(ind1,ind2);
            }
            }
            if (fruits[i]==f1){
                ind1=i;
            }
            if (fruits[i]==f2){
                ind2=i;
            }
            c++;
            flag=true;
        }
        max=Math.max(max,c);
        return max;
    }
}