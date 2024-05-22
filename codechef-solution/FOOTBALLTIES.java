import java.io.*;

class FOOTBALLTIES {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String[] a = br.readLine().split(" ");
      int x = Integer.parseInt(a[0]);
      int y = Integer.parseInt(a[1]);
      System.out.println(x % 3);
    }
  }
}
