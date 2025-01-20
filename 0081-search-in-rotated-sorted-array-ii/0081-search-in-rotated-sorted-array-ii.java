class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = pivotfind(nums);

        if(pivot == -1) return BinarySearch(nums, target, 0, nums.length - 1);
        if(nums[pivot] == target) return true;
        if(target >= nums[0]){
            return BinarySearch(nums, target, 0, pivot - 1);
        } else return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    public boolean BinarySearch(int arr[], int target, int start, int end){
        while(start <= end){
            int mid  = start + (end - start)/2;
            if(arr[mid] == target) return true;
            if(target < arr[mid] ) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }

    public int pivotfind(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]) return mid;
            if(mid > start && arr[mid] < arr[mid - 1]) return mid - 1;

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(start < end && arr[start] > arr[start + 1]) return start;
                if(end > start && arr[end] < arr[end - 1]) return end - 1;
                start++;
                end--;
            }else if(arr[start] <= arr[mid]){
                start = mid + 1;
            } else end = mid - 1;
        }
        return -1;
    }
}