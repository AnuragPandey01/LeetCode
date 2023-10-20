class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> ans = new HashSet<>();
        Set<String> set = new HashSet<>();

        int low =0; int high =0;
        StringBuilder currStr =  new StringBuilder();
        while(high<s.length()){

            currStr.append(s.charAt(high));
            while(high-low+1 > 10){
                currStr.deleteCharAt(0);
                low++;
            }
            if(high-low+1 == 10 && set.contains(currStr.toString())){
                ans.add(currStr.toString());
            }
            set.add(currStr.toString());
            high++;
        }
        return new ArrayList<>(ans);
    }
}