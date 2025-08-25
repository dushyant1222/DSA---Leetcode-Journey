class Solution {
    public boolean halvesAreAlike(String s) {
        String vow = "aeiou";
        int mid = s.length() /2;
        int count1 =0;
        int count2 =0;
        s=s.toLowerCase();
        for(int i=0; i< mid; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') count1++;
        }
        for(int i = mid; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') count2++;
        }
        if(count1 == count2) return true;
        else return false;

    }
}