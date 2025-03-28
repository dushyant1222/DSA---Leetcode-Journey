class Solution {
    public int titleToNumber(String columnTitle) {
        int i = 0;
        int result =  0;
        for(char c: columnTitle.toCharArray()){
             result = result * 26 + (c- 'A' +1);
        }
        return result;
    }
}