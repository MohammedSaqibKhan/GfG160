public class RotateBy90Degree {

    static void rotateby90(int mat[][]) {
        int len = mat.length;

        for(int i=0;i<len;i++) {
            for(int j=i+1;j<len;j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0;i<len;i++) {
            int start = 0, end = len - 1;
            while(start < end) {
                int temp = mat[start][i];
                mat[start][i] = mat[end][i];
                mat[end][i] = temp;

                start++;
                end--;
            }
        }
    }
}
