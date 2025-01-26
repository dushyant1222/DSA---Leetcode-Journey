class Solution {
    public int diagonalSum(int[][] mat) {
        int primarySum = Primary(mat, 0, 0);
        int secondarySum = Secondary(mat, 0,mat.length - 1);
        return primarySum + secondarySum;
    }
    public int Primary(int[][] mat, int row, int col){
        int psum = 0;
        while(row < mat.length && col >= 0){
            psum  += mat[row][col];
            row++;
            col++;
        }
        return psum;
    }
    public int Secondary(int[][] mat, int row, int col){
        int Ssum = 0;
        while(row < mat.length && col >= 0){
            if(row != col) Ssum += mat[row][col];
            row++;
            col--;
        }
        return Ssum;
    }
}