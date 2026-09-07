class Solution {
    /*---------------------------------------------------------------------------------------------
            There is big problem:
                    Line 3: Storing every zero coordinate in an ArrayList can result in O(m*n) auxiliary space in the worst case.
    ---------------------------------------------------------------------------------------------*/

    // public void setZeroes(int[][] matrix) {
    //     ArrayList<ArrayList<Integer>> allZeros = new ArrayList<>();
    //     int m = matrix.length;
    //     int n = matrix[0].length;

    //     for(int i=0; i<m; i++){
    //         for(int j=0; j<n; j++){
    //             if(matrix[i][j] == 0){
    //                 allZeros.add(new ArrayList<>(List.of(i, j)));
    //             }
    //         }
    //     }

    //     for(int i=0; i<allZeros.size(); i++){
    //         int row = allZeros.get(i).get(0);
    //         int col = allZeros.get(i).get(1);
    //         System.out.println(row +  " " + col);
    //         setAllZeroRec(matrix, row, col);
    //     }
    // }

    // public static void setAllZeroRec(int[][] matrix, int row, int col){
    //     // top
    //     for(int i=row; i>=0; i--){
    //         matrix[i][col] = 0;
    //     }

    //     // right
    //     for(int i=col; i<matrix[0].length; i++){
    //         matrix[row][i] = 0;
    //     }

    //     // bottom
    //     for(int i=row; i<matrix.length; i++){
    //         matrix[i][col] = 0;
    //     }

    //     // left
    //     for(int i=col; i>=0; i--){
    //         matrix[row][i] = 0;
    //     }
    // }


    /*--------------------------------------------------------------------------------------------
            Time complexity = O(m × n)
            Space complexity = O(m + n)
    --------------------------------------------------------------------------------------------*/

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i] || col[j]) matrix[i][j] = 0;
            }
        }
    }
}