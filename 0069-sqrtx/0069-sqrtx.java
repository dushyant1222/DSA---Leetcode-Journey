class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int res = 0;
        while(left<= right){
            int mid = (left + right)/2;
            long square = (long)mid*mid;
            if(square == x){
                return mid;
            }
            if(square < x){
                res = mid;
                left = mid + 1;
            }else right = mid - 1;
        }
        return res;
    }
}