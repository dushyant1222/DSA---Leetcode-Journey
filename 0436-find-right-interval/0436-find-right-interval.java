class Solution {
    public int[] findRightInterval(int[][] intervals) {
        HashMap<Integer, Integer> hsh = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < intervals.length; i++){
            hsh.put(intervals[i][0],i);
            max = Math.max(max, intervals[i][0]);
        }
        int n = intervals.length;
        int[] res = new int[n];
        for(int k =0; k<n; k++){
            int value = intervals[k][1];
            res[k] = -1;
            while(value <= max){
                if(hsh.containsKey(value)){
                    res[k] = hsh.get(value);
                    break;
                }
                value++;
            }
        }
        return res;
    }
}