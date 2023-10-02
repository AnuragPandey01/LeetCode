class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i];
            nums[i] = (int)sum;
        }
        int i =0;
        int j = k-1;
        sum = nums[k-1];
        while(j < nums.length-1){
            j++;
            i++;
            sum = Math.max(sum,(nums[j]-nums[i-1]));
        }

        return sum/k;
    }
}