class Solution {
    public boolean isPalindrome(String s) {
        String new_str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String str = new StringBuilder(new_str).reverse().toString();
        if(str.equals(new_str)) return true;
        else return false;
    }
}