// Last updated: 8/1/2025, 7:03:55 AM
class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            // Continuously merge with the last element of the list if they are not coprime
            while (!result.isEmpty() && gcd(result.get(result.size() - 1), num) > 1) {
                num = (int) lcm(result.remove(result.size() - 1), num);
            }
            result.add(num);
        }
        return result;
    }
    public static long lcm(int a,int b){
		
		return (long) ( (long) a*b)/gcd(a,b);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}