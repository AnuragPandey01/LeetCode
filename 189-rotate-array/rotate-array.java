class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            int newIndex =  (i+k)% nums.length;
            ans[newIndex] = nums[i];
        }

        System.arraycopy(ans, 0, nums, 0, nums.length);
    }
}