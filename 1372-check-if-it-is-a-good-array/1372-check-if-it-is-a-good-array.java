class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd = nums[0];
        if(nums[0] == 1){
            return true;
        }
        for(int i = 1; i<nums.length; i++){
            gcd = GCD(gcd, nums[i]);
            if(gcd == 1){
                return true;
            }
        }
        return gcd == 1;
    }
    static int GCD(int gcd1, int gcd2){
        int result = Math.min(gcd1, gcd2);
        while(gcd2 != 0){
           int temp = gcd2;
           gcd2 = gcd1 % gcd2;
           gcd1 = temp;
        }
        return gcd1;
    }
}