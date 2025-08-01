// Last updated: 8/1/2025, 7:03:26 AM
class Solution {
    public int minimizeXor(int num1, int num2) {
        int count1=0;
        while (num2>0){
            if (num2%2==1){
                count1++;
            }
            num2/=2;
        }
        
        List<Integer> ls1=new ArrayList<>();
        while (num1>0){
            ls1.add(num1%2);
            num1/=2;
        }
        Collections.reverse(ls1);
        List<Integer> ls2=new ArrayList<>();
        for (int i=0;i<ls1.size();i++){
            if (ls1.get(i)==1 && count1>0){
                ls2.add(1);
                count1--;
            }
            else{
                ls2.add(0);
            }
        }
        for (int i=ls1.size()-1;i>=0;i--){
            if (ls1.get(i)==0 && count1>0){
                ls2.set(i,1);
                count1--;
            }
        }
        int out=0;
        int pow=0;
        for (int i=ls2.size()-1;i>=0;i--){
            if (ls2.get(i)==1){
                out+=Math.pow(2,pow);
            }
            pow++;
        }
        while (count1>0){
            out+=Math.pow(2,pow);
            pow++;
            count1--;
        }

        return out;

    }
}