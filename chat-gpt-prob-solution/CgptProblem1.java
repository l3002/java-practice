import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CgptProblem1 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String in[] = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    int k = Integer.parseInt(in[1]);
    String arr[] = br.readLine().split(" ");
    long sum = 0;
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    int maxlen = -1;
    for (int i = 0; i < n; ++i) {
      long x = Long.parseLong(arr[i]);
      sum += x;
      if(x == k && maxlen < 1){
        maxlen = 1;
      }
      if (map.containsKey(sum - k)) {
        int len = i - map.get(sum - k);
        if (maxlen < len) {
          maxlen = len;
        }
      }
      if (sum == k && maxlen < i + 1) {
        maxlen = i + 1;
      }
      map.putIfAbsent(sum, i);
    }
    System.out.println(maxlen);
  }
}
