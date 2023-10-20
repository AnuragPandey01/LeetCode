class Solution {
    public int sumOfBeauties(int[] nums) {

        int[] pmax = new int[nums.length];
        int[] smin = new int[nums.length];

        pmax[0] = nums[0];
        smin[nums.length-1] = nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pmax[i] = Math.max(pmax[i-1],nums[i]);
            smin[nums.length-i-1] = Math.min(smin[nums.length-i],nums[nums.length-i-1]);
        }

        int ans = 0;
        for (int i = 1; i < nums.length-1; i++) {
            int curr = nums[i];
            if(curr > pmax[i-1] && curr < smin[i+1]) ans+=2;
            else if(curr> nums[i-1] && curr< nums[i+1]) ans++;
        }
        
        return ans;
    }
}