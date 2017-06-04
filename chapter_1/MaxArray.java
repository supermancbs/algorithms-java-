class MaxArray {
  public static void main(String[] args) {
    int[] a = {4, 1, 1000, 3, 100, 50};
    int max = a[0];
    for (int i = 0; i < a.length; i++){
      if (a[i] > max) {
        max = a[i];
      }
    }
    System.out.println(max);
  }
}
