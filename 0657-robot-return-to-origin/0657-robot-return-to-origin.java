class Solution {
    public boolean judgeCircle(String moves) {
        
        int leftright = 0, updown = 0;
        for(char i: moves.toCharArray()){
            if(i == 'U') updown ++;
            if(i == 'D') updown --;
            if(i == 'L') leftright ++;
            if(i == 'R') leftright--;
         }
         return ((leftright == 0 && updown == 0) ? true : false);

    }
}