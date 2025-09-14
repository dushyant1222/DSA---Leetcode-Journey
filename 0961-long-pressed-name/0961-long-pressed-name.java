class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int m = typed.length();

        int a = 0;
        for(int i= 0; i < m; ++i){
            if(a < n && name.charAt(a) == typed.charAt(i)) {
                ++a;
            } else if( i == 0 || typed.charAt(i) != typed.charAt(i - 1)) return false;
        }
        return  a == n;
    }
}