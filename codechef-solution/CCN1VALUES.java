import java.io.*;

class CCN1VALUES {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      System.out.print("1 ");
      long val = 1;
      for (int i = 0; i < n; ++i) {
        System.out.print(val);
        val = val << 1;
        if (i != n - 1) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
