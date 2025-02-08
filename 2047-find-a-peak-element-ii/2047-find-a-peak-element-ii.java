class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0, high = mat[0].length - 1;
        while(low <= high){
            int midcol = low + (high - low)/2;
            int maxrow = 0;
            for(int row = 1; row < mat.length; row++){
                if(mat[row][midcol] > mat[maxrow][midcol]) maxrow = row;
            }

            int midval = mat[maxrow][midcol];
            int leftval = (midcol - 1 >= 0) ? mat[maxrow][midcol - 1] : -1;
            int rightval = (midcol + 1 < mat[0].length) ? mat[maxrow][midcol + 1] : -1;

            if(midval > leftval && midval > rightval) return new int[]{maxrow, midcol};
            else if(midval < rightval) low = midcol + 1;
            else high = midcol - 1;
        }
        return new int[]{-1,-1};
    }
} 