class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;
        if(nums == null || n < 4) return arr;
        Arrays.sort(nums);
        for(int i = 0; i< n - 3; i++){
            if(i>0 && nums[i] == nums[i - 1]) continue;
            if((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if((long) nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target) continue;

            for(int j = i + 1; j< n - 2; j++){
            if(j > i+1 && nums[j] == nums[j - 1 ]) continue;
            if((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
            if((long) nums[i] + nums[j] + nums[n - 1] + nums[n - 2] < target) continue;

            int start = j + 1;
            int end = n - 1;

            while(start < end){
                long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];
                if(sum == target){
                    arr.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                    start++;
                    end--;

                    while(start < end && nums[start] == nums[start - 1])  start++;
                    while(start < end && nums[end] == nums[end + 1])  end--;
                }else if(sum < target){
                    start++;
                }else end--;
            }
            }
        }
        return arr;
    }
}