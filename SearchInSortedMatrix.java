public class SearchInSortedMatrix {

    public boolean searchMatrix(int[][] mat, int x) {

        int n = mat.length;
        int m = mat[0].length;
        int left = 0, right = n * m -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / m;
            int col = mid % m;

            int midValue = mat[row][col];

            if(midValue == x) return true;
            else if(midValue < x) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}
