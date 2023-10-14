class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        ArrayList<List<String>> ans = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        for(String str : strs){
            
            String sortStr =  sortString(str);
            if(map.containsKey(sortStr)){
                int index = map.get(sortStr);
                ans.get(index).add(str);
                continue;
            }

            ArrayList<String> temp = new ArrayList<>();
            temp.add(str);
            ans.add(temp);
            map.put(sortStr,ans.size()-1);
        }

        return ans;
    }

    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}