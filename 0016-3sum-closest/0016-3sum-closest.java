class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE / 2;

        for(int i = 0; i < nums.length - 2 ;i ++){
            if(i > 0  && nums[i] == nums[i - 1]) continue;
            int start = i + 1, end = nums.length - 1;
            while(start < end){
                int temp = nums[i] + nums[start] + nums[end];
                if(Math.abs(temp - target) < Math.abs(min - target)) min = temp;
                if(temp == target) return temp;
                else if(target < temp){
                    end--; while(start < end && nums[end] == nums[end + 1]) end--;
                }
                else{
                    start++; while(start < end && nums[start] == nums[start - 1]) start++;
                }
            }
        }
        return min;
    }
}