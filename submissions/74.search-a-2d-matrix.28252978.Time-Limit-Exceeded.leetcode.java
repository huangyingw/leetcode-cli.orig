public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows*cols - 1;
        int mid = left + (right-left)/2;
        while(left < right)
        {
            if(matrix[mid/cols][mid%cols] > target)
            {
                right = mid;
            }
            else if(matrix[mid/cols][mid%cols] < target)
            {
                left = mid;
            }
            else
            {
                return true;
            }    
        }
        return false;
    }
}
