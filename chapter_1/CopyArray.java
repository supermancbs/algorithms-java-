import java.util.Arrays;

class CopyArray {
  public static void main(String[] args) {
    int a[] = {4, 7, 1, 10, 5};
    int N = a.length;
    double b[] = new double[N];
    for (int i = 0; i < N; i++) {
      b[i] = a[i];
    }
    System.out.println(Arrays.toString(b));
  }
}
