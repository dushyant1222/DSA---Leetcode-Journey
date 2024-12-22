class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
       int maxx = 0;
       for(int i = 0; i <nums.length; i++){
        if(i > maxx){
            return false;
        }
        maxx = Math.max(maxx, i + nums[i]);
        if(maxx >= nums.length - 1){
            return true;
        }
       }
       return false;
    }
}