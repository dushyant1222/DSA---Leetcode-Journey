class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alicesum = 0 , bobsum = 0;
        for(int i: aliceSizes) {
        alicesum += i;
        }
        for(int j: bobSizes){
             bobsum += j;
        }

        int diff = (alicesum - bobsum)/2;

        Set<Integer> aliceset = new HashSet<>();
        for(int a: aliceSizes) aliceset.add(a);

        for(int b: bobSizes){
            int a = b + diff;
            if(aliceset.contains(a)) {
              return new int[]{a,b};
            }
        }
        return new int[]{-1,-1};
    }
}