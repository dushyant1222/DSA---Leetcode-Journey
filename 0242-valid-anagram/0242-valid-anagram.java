class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
                        return false;
                                }

                                        int[] charCount = new int[26]; // Array to store character frequencies

                                                for (int i = 0; i < s.length(); i++) {
                                                            charCount[s.charAt(i) - 'a']++; // Increment count for s
                                                                        charCount[t.charAt(i) - 'a']--; // Decrement count for t
                                                                                }

                                                                                        // If all values are zero, strings are anagrams
                                                                                                for (int count : charCount) {
                                                                                                            if (count != 0) {
                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                                }
                                                                                                                                                        return true;
        }
        
    }
