class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0, right = nums.length - 1, index = nums.length-1;
        while(left <= right){
            int leftsquare = nums[left] * nums[left];
            int rightsquare = nums[right] * nums[right];
            if(leftsquare > rightsquare ){
                arr[index--] = leftsquare;
                left++;
            }else{
                arr[index--] = rightsquare;
                right--;
            }
        }
        return arr;
    }
}