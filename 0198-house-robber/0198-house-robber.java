class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int prev1 = 0;
        int prev2 = 0;
        for(int i: nums){
            int temp = prev1;
            prev1 = Math.max(prev1, prev2 + i);
            prev2 = temp;
        }
        return prev1;
    }
}