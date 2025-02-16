class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0 ;i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            nums[index] = - Math.abs(nums[index]);
        }
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) arr.add(i+1);
        }
        return arr;
    }
}