class Solution {
    public int singleNumber(int[] nums) {
        int a =0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            a ^= nums[i];
        }
        return a;
    }
}