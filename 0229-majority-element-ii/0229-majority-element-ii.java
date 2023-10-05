class Solution {

    HashMap<Integer,Integer> map = new HashMap<>();
    ArrayList<Integer> ans = new ArrayList<>();
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue() > n/3){
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}