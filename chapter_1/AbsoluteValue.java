class AbsoluteValue {
  public static int abs(int x) {
    if (x < 0 ) return -x;
    else        return x;
  }
   public static void main(String[] args) {
    int input = Integer.parseInt(args[0]);
    System.out.println(AbsoluteValue.abs(input));
  }
}
