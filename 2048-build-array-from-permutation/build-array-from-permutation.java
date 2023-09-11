class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i : nums)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}