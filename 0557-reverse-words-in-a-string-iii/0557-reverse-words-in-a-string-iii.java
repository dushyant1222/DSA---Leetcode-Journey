public class Solution {
    public String reverseWords(String s) {
       StringBuilder str = new StringBuilder();
       String[] words = s.split(" ");

       for(String i : words){
        str.append(new StringBuilder(i).reverse().append(" "));
       }

       return str.toString().trim();
    }   
}