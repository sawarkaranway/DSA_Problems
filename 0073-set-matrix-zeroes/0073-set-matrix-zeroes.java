class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;          // Number of rows
        int n = matrix[0].length;       // Number of columns

        int[][] arr = new int[m][n];    // Copy matrix to store result

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = matrix[i][j];
            }
        }

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    
                    for (int k = 0; k < n; k++) {
                        arr[i][k] = 0;
                    }
                    
                    for (int k = 0; k < m; k++) {
                        arr[k][j] = 0;
                    }
                }
            }
        }

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
