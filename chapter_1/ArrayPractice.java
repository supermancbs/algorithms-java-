class ArrayPractice {
    public static void main(String[] args) {
        int N = 6;
        int [] a = {1, 3, 2, 8, 11, 5};
        int sum = a[0];
        for (int i = 0; i < a.length; i++) {
          sum+=a[i];
        }
        System.out.println(sum);
    }
}
