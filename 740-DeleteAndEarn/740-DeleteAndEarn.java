// Last updated: 8/6/2025, 6:45:02 AM
class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 1: Use PQ to sort unique keys
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int key : map.keySet()) {
            pq.add(key);
        }

        // Step 2: Extract sorted keys from PQ to array
        int[] arr = new int[map.size()];
        int i = 0;
        while (!pq.isEmpty()) {
            arr[i++] = pq.poll();
        }

        int[][] dp = new int[arr.length][2];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }

        return fn(map, arr, arr.length - 1, false, dp);
    }

    public static int fn(HashMap<Integer, Integer> map, int[] arr, int i, boolean hadTake, int[][] dp) {
        if (i < 0) return 0;
        if (dp[i][hadTake ? 1 : 0] != -1) return dp[i][hadTake ? 1 : 0];

        int notake = fn(map, arr, i - 1, false, dp);
        int take = 0;

        if (!hadTake) {
            take = arr[i] * map.get(arr[i]) + fn(map, arr, i - 1, true, dp);
        } else {
            if (arr[i + 1] - arr[i] != 1) {
                take = arr[i] * map.get(arr[i]) + fn(map, arr, i - 1, true, dp);
            }
        }

        dp[i][hadTake ? 1 : 0] = Math.max(take, notake);
        return dp[i][hadTake ? 1 : 0];
    }
}
