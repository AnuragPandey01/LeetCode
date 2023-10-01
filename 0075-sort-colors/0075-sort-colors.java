class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){

            int curr = nums[mid];

            if(curr == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(curr == 1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }

    public static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}