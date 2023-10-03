class Solution {
    public int trap(int[] nums) {

        int n = nums.length;
        int i = 0;
        int ans = 0;
        while(i<n){
            int curr = nums[i];

            if(curr == 0){
                i++;
                continue;
            }

            int j = i+1;
            int sum = 0;
            boolean flag = false;
            int flagSum = 0;
            int flagIndex = i+1;
            int flagNum = 0;

            while(j<n){
                if(nums[j] >= curr){
                    flag = true;
                    break;
                }
                if(flagNum<nums[j]){
                    flagNum = nums[j];
                    flagSum = sum;
                    flagIndex = j;
                }
                sum += nums[j];
                j++;
            }
            if(flag){
                ans += ((j-i-1)*curr)-sum;
            }else{
                ans += ((flagIndex-i-1)*Math.min(curr,flagNum))-flagSum;
            }

            if(!flag && flagIndex>i+1){
                i = flagIndex;
            }else if(j == n){
                i++;
            }else{
                i = j;
            }
        }

        return ans;
    }
}