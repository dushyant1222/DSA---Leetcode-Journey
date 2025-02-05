class Solution {
    public int majorityElement(int[] nums) {
        int count  = 0, maj_ele = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0) maj_ele = nums[i];
            if(maj_ele == nums[i]) count++;
            else count--;
        }
        return maj_ele;
    }
}