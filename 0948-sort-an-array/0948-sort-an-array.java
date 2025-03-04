class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0 , nums.length - 1);
        return nums;
    }
    private void mergesort(int[] nums, int left, int right){
        if(left >= right) return;

        int mid = left + (right - left )/2;
        mergesort(nums, left, mid);
        mergesort(nums, mid+1, right);

        merge(nums, left, mid, right);

    }
    private void merge(int[] nums, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        for(int i = 0; i < n1; i++) leftarr[i] = nums[left + i];
        for(int i = 0; i < n2; i++) rightarr[i] = nums[mid + 1 + i]; 
        int i = 0, j = 0 , k =left;

        while(i < n1 && j < n2){
            if(leftarr[i] <= rightarr[j]) nums[k++] = leftarr[i++];
            else nums[k++] = rightarr[j++];
        }
        while(i < n1) nums[k++] = leftarr[i++];
        while(i < n2) nums[k++] = rightarr[j++];
    }
}