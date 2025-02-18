class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for(int i: nums){
            if(i > max1){
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if(max1 > i && i > max2){
                max3 = max2;
                max2 = i;
            } else if(max2 > i && i > max3) max3 = i;
        }
        return max3 != Long.MIN_VALUE ? (int) max3 : (int) max1;
    }
}