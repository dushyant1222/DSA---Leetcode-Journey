class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sbb = new StringBuilder();

        for(int i = s.length()-1; i>=0; i-- ){
            int no;
            if(s.charAt(i) == '#'){
                no = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
                sbb.append((char)('a' + (no - 1)));
                i-=2;
            } else { 
                no = s.charAt(i) -'0';
                sbb.append((char)('a' + (no-1)));
            }
        }
        return sbb.reverse().toString();
                             
    }
}