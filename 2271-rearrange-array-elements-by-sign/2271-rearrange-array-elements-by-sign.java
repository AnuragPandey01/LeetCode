class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int ni = 0;
        int pi = 0;

        for(int i=0;i<nums.length;i++){

            int curr = nums[i];

            if(curr < 0){
                neg[ni++] = curr;
            }else{
                pos[pi++] = curr;
            }
        }

        ni = 0;
        pi = 0;

        for(int i=0; i<nums.length;i++){
            if(i%2 == 0){
                nums[i] = pos[pi++];
            }else{
                nums[i] = neg[ni++];
            }
        }
        return nums;
    }
}