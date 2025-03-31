class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(String i: words){
            StringBuilder reversedword = new StringBuilder(i);
            reversedword.reverse();
            reversed.append(reversedword).append(" ");
        }
        return reversed.toString().trim();
    }
}