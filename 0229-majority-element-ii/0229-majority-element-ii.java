class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 =  0, count2 = 0;
        int maj1 = Integer.MIN_VALUE, maj2 = Integer.MIN_VALUE;
        for(int i : nums){
            if(i == maj1) count1++;
            else if(i == maj2) count2++;
            else  if(count1 == 0){
                count1 = 1;
                maj1 = i;
            }
            else if(count2 == 0){
                count2 = 1;
                maj2 = i;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> result = new ArrayList<>();
        int freq1 = 0;
        int freq2 = 0;
        for(int i: nums){
            if(i == maj1) freq1++;
            else if(i == maj2) freq2++;
        }
        if(freq1 > n/3) result.add(maj1);
        if(freq2 > n/3) result.add(maj2);
        return result;
    }
}