class Solution {
    public int strStr(String haystack, String needle) {
       int n = needle.length();
       int m = haystack.length();

       int[] lps = new int[n];
       int prevlps = 0;
       int i = 1;

       while(i < n){
        if(needle.charAt(i) == needle.charAt(prevlps)){
            lps[i] = prevlps + 1;
            prevlps++;
            i++;
        } else if(prevlps == 0){
            lps[i] = 0;
            i++;
        } else prevlps = lps[prevlps - 1];
       }
       int j =0, k = 0;
       while(j < m){
        if(haystack.charAt(j) == needle.charAt(k)){
            j++;
            k++;
        } else if(k == 0) j++;
        else k = lps[k - 1];

        if(k == n) return j - n;
       }
       return -1;
    }
}