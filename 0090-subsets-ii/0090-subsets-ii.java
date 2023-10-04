class Solution {
    private ArrayList<List<Integer>> ans = new ArrayList<>();
    private HashMap<List<Integer>,Boolean> map = new HashMap<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subsets(nums,new ArrayList<>(),0);
        ans.add(new ArrayList<>());
        return ans;
    }
    public void subsets(int[] nums, ArrayList<Integer> prev,int i) {
        for(int j =i; j<nums.length;j++){
            ArrayList<Integer> list = new ArrayList<>(prev);
            list.add(nums[j]);
            if(!map.containsKey(list)){
                ans.add(list);
                map.put(list,true);
            }
            subsets(nums,list,j+1);
        }
    }
}