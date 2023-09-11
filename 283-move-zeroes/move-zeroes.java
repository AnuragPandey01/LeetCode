class Solution {
    public void moveZeroes(int[] nums) {

        int[] ans = new int[nums.length];
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                ans[count++] = nums[i];
            }
        }

        for(int i =0;i<nums.length;i++){
            nums[i] = ans[i];
        }
    }
}