class Solution {
    public String largestNumber(int[] nums) {
        String[] Str = new String[nums.length];
        for(int i =0; i < nums.length; i++) Str[i] = String.valueOf(nums[i]);
        Arrays.sort(Str, (a,b) -> (b+a).compareTo(a+b));
        if(Str[0].equals("0")) return "0";
        StringBuilder res = new StringBuilder();
        for(String  s: Str) res.append(s);
        return res.toString();
    }
}