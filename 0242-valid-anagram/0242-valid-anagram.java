class Solution {

    
    private HashMap<Character,Integer> map = new HashMap<>();
    private HashMap<Character,Integer> map2 = new HashMap<>();
    public boolean isAnagram(String s, String t) {
        
        boolean flag = true;
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        
        return map.equals(map2);
    }
}