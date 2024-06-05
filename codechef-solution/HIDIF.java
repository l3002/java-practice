import java.io.*;

public class HIDIF {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String[] arr = br.readLine().split(" ");
      int n = Integer.parseInt(arr[0]);
      int k = Integer.parseInt(arr[1]);
      String[] arr1 = br.readLine().split(" ");
      long sum = 0;
      for (int i = 0; i < n - 1; ++i) {
        int ai = Integer.parseInt(arr1[i]);
        int ai1 = Integer.parseInt(arr1[i + 1]);
        sum += Math.abs(ai - ai1);
      }
      long max = sum;
      for (int i = 0; i < n; ++i) {
        long curr = sum;
        int ai = Integer.parseInt(arr1[i]);
        if (i == 0) {
          int ai1 = Integer.parseInt(arr1[i + 1]);
          curr -= Math.abs(ai - ai1);
          int max_in = Math.abs(1 - ai1);
          if (max_in < Math.abs(k - ai1)) {
            max_in = Math.abs(k - ai1);
          }
          curr += max_in;
        } else if (i == n - 1) {
          int ai1 = Integer.parseInt(arr1[i - 1]);
          curr -= Math.abs(ai - ai1);
          int max_in = Math.abs(ai1 - 1);
          if (max_in < Math.abs(k - ai1)) {
            max_in = Math.abs(k - ai1);
          }
          curr += max_in;
        } else {
          int aim1 = Integer.parseInt(arr1[i - 1]);
          int ai1 = Integer.parseInt(arr1[i + 1]);
          curr -= Math.abs(ai - aim1) + Math.abs(ai - ai1);
          int max_in = Math.abs(k - aim1) + Math.abs(k - ai1);
          int val2 = Math.abs(1 - aim1) + Math.abs(1 - ai1);
          if (max_in < val2) {
            max_in = val2;
          }
          curr += max_in;
        }
        if (max < curr) {
          max = curr;
        }
      }
      System.out.println(max);
    }
  }
}
