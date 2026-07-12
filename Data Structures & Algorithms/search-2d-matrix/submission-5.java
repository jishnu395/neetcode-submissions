// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int low = matrix.length;
//         int high = matrix[0].length;
//         for(int i = 0; i<low; i++) {
//             for(int j = 0; j<high; j++) {
//                 if(matrix[i][j] == target) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = n * m - 1;
        while(low <= high) {
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            
            int val = matrix[row][col];

            if(val == target){
                return true;
            }else if(val < target) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}
