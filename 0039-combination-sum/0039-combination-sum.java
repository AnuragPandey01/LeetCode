class Solution {
    private ArrayList<List<Integer>> ans = new ArrayList<>();
    private HashMap<ArrayList<Integer>,Boolean> map = new HashMap<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combsum(candidates,target,new ArrayList<>(),0);
        return ans;
    }

    public void combsum(int[] candidates,int target,ArrayList<Integer> prev,int sum){
        if(sum == target){
            Collections.sort(prev);
            if(!map.containsKey(prev)){
                ans.add(prev);
                map.put(prev,true);
            }
            return;
        }
        for (int candidate : candidates) {
            ArrayList<Integer> list = new ArrayList<>(prev);
            if (candidate + sum <= target) {
                list.add(candidate);
                combsum(candidates, target, list, sum + candidate);
            }
        }
    }
}  