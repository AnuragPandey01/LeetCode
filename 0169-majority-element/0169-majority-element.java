class Solution {
    public int majorityElement(int[] nums) {

        int count = 1;
        int ele = nums[0];

        for(int i=1;i<nums.length;i++){
            int curr = nums[i];

            if(count == 0){
                ele = nums[i];
                count++;
            }else if(curr == ele){
                count++;
            }else{
                count--;
            }
        }

        return ele;
    }
}