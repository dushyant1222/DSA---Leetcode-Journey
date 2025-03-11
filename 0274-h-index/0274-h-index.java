class Solution {
    public int hIndex(int[] citations) {
        int[] sortedarr = new int[citations.length + 1];
        
        for(int c: citations){
            if(c>= citations.length) sortedarr[citations.length]++;
            else sortedarr[c]++;
        }

        int idx = 0;
        for(int i = citations.length; i>=0; i--){
            idx += sortedarr[i];
            if(idx >= i) return i;
        }
        return 0;
    }
}