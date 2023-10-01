class Solution {
    public int[] twoSum(int[] nums, int target) {
    // Create a HashMap to store the values and their corresponding indices.
    HashMap<Integer, Integer> map = new HashMap<>();
    
    // Initialize an array to store the result, initially with zeros.
    int[] ans = new int[2];
    
    // Loop through the input array 'nums'.
    for (int i = 0; i < nums.length; i++) {
        int curr = nums[i]; // Current number from the array.
        
        // Check if there is a complement value (target - curr) in the HashMap.
        if (map.containsKey(target - curr)) {
            // If a complement is found, set the indices in the result array.
            ans[0] = map.get(target - curr); // Index of the complement.
            ans[1] = i; // Current index.
            
            // Break out of the loop since we've found the answer.
            break;
        }
        
        // If the complement is not found, store the current number and its index in the HashMap.
        map.put(curr, i);
    }

    // Return the result array containing the indices of the two numbers that add up to the target.
    return ans;
}

}