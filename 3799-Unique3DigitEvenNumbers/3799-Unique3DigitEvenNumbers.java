// Last updated: 8/1/2025, 7:01:20 AM
class Solution {
    public int totalNumbers(int[] digits) {
        List<Integer> ls = new ArrayList<>();
        int cnt = 0;
        int n = digits.length;
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n ; j++){
                for (int k=0 ; k<n ; k++){
                    if (i!=j && j!=k && i!=k){
                        int digit = digits[k];
                        if (digits[i]!=0 && (digit==0 || digit==2 || digit==4 || digit==6 || digit==8)){
                            int num = digits[i]*100 + digits[j]*10 + digits[k];
                            if (!ls.contains(num)){
                                cnt++;
                                ls.add(num);
                            }
                        }
                    }
                }
            }
        }
        return cnt;
    }
}