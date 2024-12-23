class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            while(nums[i] > 0 && nums[i]<=n && nums[nums[i]-1] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp -1] = temp;
            }
        }
        int least = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == least){
                least++;
            }
        }
        return least;
    }
}