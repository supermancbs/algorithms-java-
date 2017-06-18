import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;

class ThreeNumbersNotEqual {
  public static void main(String[] args) {
    int first = Integer.parseInt(args[0]);
    int sec = Integer.parseInt(args[1]);
    int third = Integer.parseInt(args[2]);

    if ((first == sec) && (sec == third)) {
      StdOut.println("equal");
    } else {
      StdOut.println("not equal");
    }
  }
}
