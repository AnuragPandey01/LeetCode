class Solution {

    private ArrayList<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subsets(nums,new ArrayList<>(),0);
        ans.add(new ArrayList<>());
        return ans;
    }
    public void subsets(int[] nums, ArrayList<Integer> prev,int i) {
        for(int j =i; j<nums.length;j++){
            ArrayList<Integer> list = new ArrayList<>(prev);
            list.add(nums[j]);
            ans.add(list);
            subsets(nums,list,j+1);
        }
    }


}