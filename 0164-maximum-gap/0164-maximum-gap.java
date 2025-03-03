class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length == 1) return 0;

        Arrays.sort(nums);
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length - 1; i++){
            if(res < nums[i+1] - nums[i]) res = nums[i + 1]- nums[i];
        }
        return res;
    }
}