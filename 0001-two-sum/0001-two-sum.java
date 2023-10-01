class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            if(map.containsKey(target-curr)){
                ans[0] = map.get(target-curr);
                ans[1] = i;
                break;
            }
            map.put(curr,i);
        }

        return ans;
    }
}