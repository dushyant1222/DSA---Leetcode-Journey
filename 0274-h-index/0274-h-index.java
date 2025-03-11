class Solution {
    public int hIndex(int[] citations) {
        Integer[] sortedarr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedarr, Collections.reverseOrder());
        int idx = 1;
        for(int i = 0 ; i < sortedarr.length; i++){
            if(sortedarr[i] >= idx) idx++;
            else break;
        }
        return idx -1;
    }
}