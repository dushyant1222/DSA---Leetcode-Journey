class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        Integer[] sortedarr = new Integer[score.length];
        for(int i = 0; i < score.length; i++){
            sortedarr[i] = i;
        }
        Arrays.sort(sortedarr, (a,b) -> Integer.compare(score[b], score[a]));
        for(int i = 0; i < score.length; i++){
            if( i== 0) answer[sortedarr[i]] = "Gold Medal";
            else if(i == 1) answer[sortedarr[i]] = "Silver Medal";
            else if(i == 2) answer[sortedarr[i]] = "Bronze Medal";
            else answer[sortedarr[i]] = String.valueOf(i + 1); 
        }
        return answer;
    }
}