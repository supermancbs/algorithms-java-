public class IsPalindrome {
  public static void main(String [] args) {
    String s = args[0];
    int N = s.length();
    String result = "TRUE";
    for (int i = 0; i < N/2; i++) {
      if (s.charAt(i)!=s.charAt(N-1-i)){
        result = "FALSE";
        break;
      }
    }
    System.out.println(result);
  }
}
