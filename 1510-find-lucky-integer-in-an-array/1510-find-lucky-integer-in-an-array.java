class Solution {
    public int findLucky(int[] arr) {
        int ans = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == e.getKey()){
                ans = e.getValue();
            }
        }

        return ans;
    }
}