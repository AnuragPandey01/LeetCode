class Solution {
    private Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combsum(candidates,target,new ArrayList<>(),0);
        return set.stream().toList();
    }

    public void combsum(int[] candidates,int target,ArrayList<Integer> prev,int sum){
        if(sum == target ){
            Collections.sort(prev);
            if(!set.contains(prev)){
                set.add(prev);
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