class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int maxele = Integer.MIN_VALUE;
        int minele = Integer.MAX_VALUE;
        
        Set<Integer> set = new HashSet<>();

        for(int i: arr){
            maxele = Math.max(maxele, i);
            minele = Math.min(minele, i);
            set.add(i);

        }
        if((maxele - minele) % (arr.length - 1) !=0) return false;
        int difference = (maxele - minele)/(arr.length - 1);
        for(int i =0; i < arr.length; i++){
            int ele = minele + i * difference;
            if(!set.contains(ele)) return false;
        }
        return true;
    }
}