import java.util.Arrays;

class ReverseArray {
  public static void main(String[] args) {
    int a[] = {3, 5, 6, 7, 8};
    int N = a.length;
    for (int i = 0; i < N/2; i++) {
      int temp = a[i];
      a[i] = a[N-1-i];
      a[N-1-i] = temp;
    }
    System.out.println(Arrays.toString(a));
  }
}
