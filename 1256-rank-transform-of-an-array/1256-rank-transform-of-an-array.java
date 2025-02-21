class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int i = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int j = 0;j < arr.length; j++) map.put(arr[j],j);
        i = 1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            map.put(entry.getKey(), i);
            i++;
        }
        for(int j = 0; j < arr.length; j++) arr[j] = map.get(arr[j]);
        return arr;
    }
}