class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Boolean> map = new HashMap<>();

        int n = s.length();
        int maxLen = 0;
        int count = 0;
        int start = 0;
        int i =0;
        while(i<n){

            if(map.containsKey(s.charAt(i))){
                count = 0;
                i = start+1;
                start = i;
                map.clear();
            }

            count++;
            if(count>maxLen){
                maxLen = count;
            }
            map.put(s.charAt(i),true);
            i++;
        }

        return maxLen;

    }
}