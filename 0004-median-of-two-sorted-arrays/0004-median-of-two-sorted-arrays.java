class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int n1 = 0;
        int n2 = 0;
        int k = 0;
        int [] result = new int[m + n];
        while(n1 < m && n2 < n){
            if(nums1[n1] <= nums2[n2]){
                result[k++] = nums1[n1++];
            } else result[k++] = nums2[n2++];
        }
        while(n1 < m) result[k++] = nums1[n1++];
        while(n2 < n) result[k++] = nums2[n2++];
        double median = 0;
        int len = result.length;
        if(len % 2 != 0){
            median = result[(len-1)/2];
        } else median = (result[(len-1)/2] + result[(len-1)/2 + 1])/2.0;
        return median;
    }
}