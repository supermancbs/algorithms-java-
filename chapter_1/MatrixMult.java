import java.util.Arrays;

class MaxtrixMult {
  public static void main(String[] args) {
    int[][] a = {{1, 2}, {3, 4}};
    int[][] b = {{2, 2}, {2, 3}};
    int N = a.length;
    double[][] c = new double[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        for (int k = 0; k < N; k++) {
          c[i][j] += a[i][j]*b[k][j];
        }
      }
    }
    System.out.println(Arrays.deepToString(c));
  }
}
