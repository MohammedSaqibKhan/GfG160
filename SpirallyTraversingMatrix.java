import java.util.ArrayList;

public class SpirallyTraversingMatrix {

    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        int m = mat.length;
        int n = mat[0].length;
        int left = 0, top = 0, right = n - 1, bottom = m - 1;
        ArrayList<Integer> result = new ArrayList<>();

        while(top <= bottom && left <= right) {

            for(int i=left; i<=right; i++) {
                result.add(mat[top][i]);
            }
            top++;


            for(int i=top; i<=bottom; i++) {
                result.add(mat[i][right]);
            }
            right--;

            if(top <= bottom) {
                for(int i=right; i>=left; i--) {
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }

            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
