// Last updated: 8/1/2025, 7:10:16 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        // starting n-k
        Reverse(nums,0,n-k-1);
        // last k elements
        Reverse(nums,n-k,n-1);
        // all elements
        Reverse(nums,0,n-1);
    }
    public static void Reverse(int [] arr,int i,int j) {
		while (i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}