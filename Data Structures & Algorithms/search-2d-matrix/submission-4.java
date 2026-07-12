class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = matrix.length;
        int high = matrix[0].length;
        for(int i = 0; i<low; i++) {
            for(int j = 0; j<high; j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
