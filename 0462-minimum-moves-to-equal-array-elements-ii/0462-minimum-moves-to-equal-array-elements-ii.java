class Solution {
    public int minMoves2(int[] nums) {
        int count = 0; 
        Arrays.sort(nums);
        int median = 0 + ((nums.length - 1) - 0)/2;
        for(int i = 0; i < nums.length; i++){
            count += Math.abs(nums[i] - nums[median]);
        }
        return count;
    }
}