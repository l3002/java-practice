import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF1957A {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String arr[] = br.readLine().split(" ");
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      for (int i = 0; i < n; ++i) {
        if (map.putIfAbsent(arr[i], 1) != null) {
          map.put(arr[i], map.get(arr[i]) + 1);
        }
      }
      int finalCount = 0;
      for (String a : map.keySet()) {
        if (map.get(a) >= 3) {
          finalCount += map.get(a) / 3;
        }
      }
      System.out.println(finalCount);
    }
  }
}
