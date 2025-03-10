class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] idxarr = new int[10001];
        for(int i = 0; i < nums2.length; i++) idxarr[nums2[i]] = i;

        for(int i = 0; i < nums1.length; i++) nums1[i] = findgreater(nums2, idxarr[nums1[i]]);
        return nums1;
    }
    public int findgreater(int[] nums2, int idx){
        for(int i = idx + 1; i < nums2.length; i++){
            if(nums2[i] > nums2[idx]) return nums2[i];
        }
        return -1;
    }
}