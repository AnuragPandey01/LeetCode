class Solution {
    public int subarraySum(int[] nums, int k) {


        int n = nums.length;
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){

            sum += nums[i];

            count += map.getOrDefault(sum-k,0);

            map.put(sum,map.getOrDefault(sum,0)+1);

            if(sum == k){
                count++;
            }

        }

        return count;
    }
}