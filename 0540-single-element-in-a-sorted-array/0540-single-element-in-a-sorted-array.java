class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = 1;
        for(int i = 0; i< nums.length; i++){
            if((right == nums.length - 1) || (left == nums.length -1)) return nums[left];
            if(nums[left] != nums[right]) {
                return nums[left];
            }else {
                left +=2;
                right +=2;
            }
        }
        return -1;
    }
}