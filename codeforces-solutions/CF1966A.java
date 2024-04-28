import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF1966A {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String[] arr = br.readLine().split(" ");
      int n = Integer.parseInt(arr[0]);
      int k = Integer.parseInt(arr[1]);
      String[] arr1 = br.readLine().split(" ");
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      for (int i = 0; i < n; ++i) {
        if (map.putIfAbsent(arr1[i], 1) != null) {
          map.put(arr1[i], map.get(arr1[i]) + 1);
        }
      }
      boolean flag = false;
      for (String key : map.keySet()) {
        if (map.get(key) >= k) {
          flag = true;
          break;
        }
      }
      if (flag) {
        System.out.println(k - 1);
      } else {
        System.out.println(n);
      }
    }
  }
}
