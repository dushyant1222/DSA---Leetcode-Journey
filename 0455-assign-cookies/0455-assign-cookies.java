class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cnum = s.length;
        if(cnum ==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int maxnum = 0;
        int cindex = cnum - 1;
        int childindex = g.length - 1;
        while(cindex >= 0 && childindex >=0){
            if(s[cindex] >= g[childindex]){
                maxnum++;
                cindex--;
                childindex--;
            } else childindex--;
        }
        return maxnum;
    }
}