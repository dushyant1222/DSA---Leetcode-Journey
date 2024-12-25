class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = searching(nums,target, true);
        if(first == -1) return new int [] {-1,-1};
        int last = searching(nums, target, false);
        return new int[] {first, last};
    }
    private int searching(int [] nums, int target, boolean find_first){
        int left=0, right = nums.length-1, result = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                result = mid;
                if(find_first){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else if(nums[mid] < target){
                left = mid + 1;
            }else right = mid - 1;
        }
        return result;
    }
}