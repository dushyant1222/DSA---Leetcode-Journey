class Solution {
    public boolean isPerfectSquare(int num) {
        for(double i = 1; i*i<= num; i++){
            if(i * i == num) {
                if((num%i ==0) && (num/i == i)) return true;
                
            }
        }
        return false;
    }
}