class Solution {
    public int removeDuplicates(int[] nums) {

        int len  = nums.length;

        if(len == 1){
            return 1;
        }
        int i =0;
        int j = 1;

        while(j<len){

            if(nums[j] == nums[i]){
                j++;
                continue;
            }

            nums[i+1] = nums[j];
            i++;
            j++;
        }

        return i+1;
 
    }
}