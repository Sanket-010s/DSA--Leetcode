import java.util.Arrays;

class RotateImage {
    public String solution(int matrix[][]) {

        int m = matrix.length - 1;
        int n = matrix[0].length - 1;

        for (int i = 0; i <= m; i++) {
            for (int j = i; j <= n; j++) {
                int temp;

                temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
            System.out.println();
        }

        for (int i = 0; i <= n; i++) {
            int left = 0;
            int right = n;
            while (left < right) {
                int temp;

                temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
        String result = Arrays.deepToString(matrix);
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        RotateImage obj = new RotateImage();
        System.out.println(obj.solution(arr));

    }
}
