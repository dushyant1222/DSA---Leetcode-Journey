class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        int maxLen = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {
            // Odd length palindrome
            int len1 = expandFromCenter(s, i, i);
            // Even length palindrome
            int len2 = expandFromCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }

    // Helper function to expand around the center
    private int expandFromCenter(String s, int left, int right) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // return length of the palindrome
        return right - left - 1;
    }
}