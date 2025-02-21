class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr_copy = arr.clone();
        Arrays.sort(arr_copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for(int i : arr_copy){
            if(!map.containsKey(i)){
                map.put(i, rank);
                rank++;
            }
        }
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}