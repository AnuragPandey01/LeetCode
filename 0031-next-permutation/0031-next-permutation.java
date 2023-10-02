class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int index = -1;
        for(int i =n-2; i>=0; i-- ){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            Arrays.sort(nums);
            return;
        }

        for(int i= n-1;i>= 0;i--){
            if(nums[i] > nums[index]){
                swap(nums,i,index);
                break;
            }
        }

        Arrays.sort(nums,index+1,n);
    }

    public static void swap(int[] nums, int a ,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}