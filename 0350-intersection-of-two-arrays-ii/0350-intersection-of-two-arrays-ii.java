class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left = 0, right = 0;
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] == nums2[right]){
                arr1.add(nums1[left]);
                left++;
                right++;
            }
            else if(nums1[left] > nums2[right]) right++;
            else left++;
        }
        int[] result = new int[arr1.size()];
        for(int i = 0; i< arr1.size(); i++){
            result[i] = arr1.get(i);
        }
        return result;
    }
}