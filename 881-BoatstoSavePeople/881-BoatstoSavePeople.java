// Last updated: 10/2/2025, 7:37:51 AM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        Arrays.sort(people);
        int bc=0;
        int left=0;
        int right=n-1;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            bc++;
        }
        return bc; 
    }
}