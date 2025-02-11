class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)) return true;
        }
        return false;
    }
}