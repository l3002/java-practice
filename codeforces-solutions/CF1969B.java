import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1969B {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String arr = br.readLine();
      long cost = 0;
      int count1 = 0;
      int count0 = 0;
      int n = arr.length();
      for (int i = 0; i < n; ++i) {
        if (arr.charAt(i) == '0') {
          count0++;
        }
        if ((arr.charAt(i) == '1') || (i == (n - 1))) {
          if (count1 > 0) {
            cost += (count1 + 1) * count0;
          }
          count1++;
          count0 = 0;
        }
      }
      System.out.println(cost);
    }
  }
}
