class Solution {

    ArrayList<List<Integer>> ans=  new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {

        
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0 ; i<n ; i++){

            if(i>0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = n-1;
            while(j<k){
                
                int curr = nums[i] + nums[j] + nums[k];
                if(curr > 0){
                    k--;
                }else if( curr < 0){
                    j++;
                }else{
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    
                    j++;
                    k--;
                    while(j<k && nums[j]== nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }

        }

        return ans;
    }
}