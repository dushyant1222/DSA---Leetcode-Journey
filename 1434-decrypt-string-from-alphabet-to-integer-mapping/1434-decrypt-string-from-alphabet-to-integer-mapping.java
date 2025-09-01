class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sbb = new StringBuilder();

        for(int i = s.length()-1; i>=0; i-- ){
            int no;
            if(s.charAt(i) == '#'){
                no = Integer.parseInt("" + s.charAt(i-2) + s.charAt(i-1));
                sbb.append((char)('a' + (no - 1)));
                i-=2;
            } else { 
                no =Integer.parseInt("" + s.charAt(i));
                sbb.append((char)('a' + (no-1)));
            }
        }
        return sbb.reverse().toString();
                             
    }
}