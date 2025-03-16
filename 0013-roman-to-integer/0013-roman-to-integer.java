class Solution {
    public int romanToInt(String s) {
        int res= 0 , n =0;
        for(int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(c == 'I') n = 1;
            else if(c == 'V') n= 5;
            else if(c == 'X') n = 10;
            else if(c == 'L') n= 50;
            else if(c == 'C') n = 100;
            else if(c == 'D') n = 500;
            else if(c == 'M') n =1000;

            if(4 * n < res){
                res -= n;
            } else res += n;
        }
        return res;
    }
}