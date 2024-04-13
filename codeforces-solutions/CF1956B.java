import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CF1956B {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String[] a = br.readLine().split(" ");
      HashSet<String> set = new HashSet<String>();
      int count = 0;
      for (int i = 0; i < n; ++i) {
        if (set.contains(a[i])) {
          count++;
        } else {
          set.add(a[i]);
        }
      }
      System.out.println(count);
    }
  }
}
