class Solution {
     public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        Set<Integer> colset = new LinkedHashSet<>();
        Set<Integer> rowset = new LinkedHashSet<>();

        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == 0){
                    colset.add(j);
                    rowset.add(i);
                }
            }
        }

        for (Integer i : colset) {
            for (int j = 0; j < row ; j++) {
                matrix[j][i] = 0;
            }
        }

        for (Integer i : rowset) {
            for (int j = 0; j < col ; j++) {
                matrix[i][j] = 0;
            }
        }
    }
}