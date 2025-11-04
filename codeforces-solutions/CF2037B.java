import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF2037B {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int k = Integer.parseInt(br.readLine());
      String arr[] = br.readLine().split(" ");
      HashMap<Double, Integer> map = new HashMap<>();
      for (int i = 0; i < k; ++i) {
        Double ai = Double.parseDouble(arr[i]);
        if (map.putIfAbsent(ai, 1) != null) {
          map.put(ai, map.get(ai) + 1);
        }
      }
      Double nm = (double) k - 2;
      int ans = 0;
      for (int i = 0; i < k; ++i) {
        double ai = Double.parseDouble(arr[i]);
        if (map.get(ai) == 1) {
          map.remove(ai);
        }
        if (map.containsKey(nm / ai)) {
          ans = (int) ai;
          break;
        }
        map.putIfAbsent(ai, 1);
      }
      System.out.println(ans + " " + ((int) (nm / ans)));
    }
  }
}
