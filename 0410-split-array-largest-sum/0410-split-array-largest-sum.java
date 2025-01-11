class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for(int num: nums){
            left = Math.max(left, num);
            right += num;
        }
        while(left < right){
            int mid = left+(right-left)/2;
            if(cansplit(nums, k,mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    private boolean cansplit(int[] nums, int k, int target){
        int currentsum = 0, splits = 1;
        for(int num: nums){
            currentsum += num;
            if(currentsum > target){
                currentsum = num;
                splits++;
                if(splits > k) return false;
            }
        }
        return true;
    }
}