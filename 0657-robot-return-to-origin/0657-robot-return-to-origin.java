class Solution {
    public boolean judgeCircle(String moves) {
        int updown = 0, leftright = 0;
        for(char c: moves.toCharArray()){
            if(c == 'U') updown++;
            else if(c == 'D') updown--;
            else if(c == 'R') leftright++;
            else if(c == 'L') leftright--;

        }
        return(updown == 0 && leftright == 0);
    }
}