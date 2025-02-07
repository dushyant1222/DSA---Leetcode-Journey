class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE / 2;

        for(int i = 0; i < nums.length - 2 ;i ++){
            int start = i + 1, end = nums.length - 1;
            while(start < end){
                int temp = nums[i] + nums[start] + nums[end];
                if(Math.abs(temp - target) < Math.abs(min - target)) min = temp;
                if(temp == target) return temp;
                else if(target < temp) --end;
                else ++start;
            }
        }
        return min;
    }
}