class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyno = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] rowmin = new int[rows];
        int[] mincolindex = new int[rows];
        for (int i = 0; i < rows; i++) {
            int minval = matrix[i][0];
            int colindex = 0;
            for (int j = 1; j < cols; j++) { 
                if (matrix[i][j] < minval) {
                    minval = matrix[i][j];
                    colindex = j; 
                }
            }
            rowmin[i] = minval;
            mincolindex[i] = colindex;
        }

        int[] colmax = new int[cols];
        for (int j = 0; j < cols; j++) {
            int maxval = matrix[0][j]; 
            for (int i = 1; i < rows; i++) { 
                if (matrix[i][j] > maxval) {
                    maxval = matrix[i][j];
                }
            }
            colmax[j] = maxval;
        }

        for (int i = 0; i < rows; i++) {
            int rowMinValue = rowmin[i];
            int colIndex = mincolindex[i];

            if (colmax[colIndex] == rowMinValue) { 
                luckyno.add(rowMinValue);
            }
        }

        return luckyno;
    }
}