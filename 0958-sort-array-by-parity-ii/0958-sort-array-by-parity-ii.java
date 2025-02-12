class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int evenindex = 0, oddindex = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0 && evenindex < nums.length){
                ans[evenindex] = nums[i];
                evenindex += 2;
            } else if(oddindex < nums.length){
                ans[oddindex] = nums[i];
                oddindex += 2;
            }
        }
        return ans;
    }
}