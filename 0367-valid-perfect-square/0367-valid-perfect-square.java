class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2) return true;
        long left = 2, right = num/2, mid;
        while(left <= right){
            mid = left + (right - left)/2;
            if(mid*mid == num) return true;
            else if(mid*mid > num) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}