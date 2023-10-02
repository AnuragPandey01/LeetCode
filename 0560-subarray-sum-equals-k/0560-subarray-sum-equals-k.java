class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0; 
        int sum = 0;   
        // Create a HashMap to store the running sum and its frequency.
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for (int num : nums) {
            sum += num; // Update the running sum.

            // Check if there exists a subarray with a sum of 'k' by looking for 'sum - k' in the HashMap.
            count += map.getOrDefault(sum - k, 0);

            // Increment the frequency of the current running sum in the HashMap.
            map.put(sum, map.getOrDefault(sum, 0) + 1);

            // If the current running sum is equal to 'k', increment the count.
            if (sum == k) {
                count++;
            }
        }

        return count; 
    }

}