class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Create a HashMap to keep track of characters and their presence in the current substring.
        HashMap<Character, Boolean> map = new HashMap<>();

        int n = s.length(); // Get the length of the input string.
        int maxLen = 0; // Initialize the maximum substring length.
        int count = 0; // Initialize a variable to count the length of the current substring.
        int start = 0; // Initialize the start index of the current substring.
        int i = 0; // Initialize the current index for iterating through the string.

        // Iterate through the string.
        while (i < n) {
            if (map.containsKey(s.charAt(i))) {
                // If the current character is already in the substring, reset the substring.
                count = 0;
                i = start + 1; // Move to the character after the first occurrence of the repeated character.
                start = i; // Update the start index for the new substring.
                map.clear(); // Clear the HashMap to track the new substring.
            }

            count++; // Increment the length of the current substring.

            if (count > maxLen) {
                // If the current substring is longer than the previously recorded maximum, update it.
                maxLen = count;
            }

            map.put(s.charAt(i), true); // Mark the current character as present in the substring.
            i++; // Move to the next character.
        }

        // 'maxLen' now contains the length of the longest substring without repeating characters.
        return maxLen;
    }

}