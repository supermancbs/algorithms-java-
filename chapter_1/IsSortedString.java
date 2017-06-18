class IsSortedString {
  public static boolean isSorted(String[] s) {
    int N = s.length;
    for (int i = 0; i < N - 1; i++){
      if (s[i].compareTo(s[i+1]) > 0){
        return false;
      }
    }
    return true;
  }

  public static void main (String[] args) {
    if (isSorted(args)) {
      System.out.println("SORTED");
    } else {
      System.out.println("NOT SORTED");
    }
  }
}
