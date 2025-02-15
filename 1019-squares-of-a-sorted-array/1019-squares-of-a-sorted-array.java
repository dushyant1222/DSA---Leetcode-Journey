class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            arr[index++] = nums[i] * nums[i];
        }
        for(int k =0 ; k<arr.length; k++){
            for(int j = 1; j < arr.length  - k; j++){
            if(arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            }
        }
        return arr;
    }
}