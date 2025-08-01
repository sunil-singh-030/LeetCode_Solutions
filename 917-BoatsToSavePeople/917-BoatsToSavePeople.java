// Last updated: 8/1/2025, 7:06:53 AM
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