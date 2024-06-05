import java.io.*;

public class CMIX {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][2];
      for (int i = 0; i < n; ++i) {
        String[] curr = br.readLine().split(" ");
        arr[i][0] = Integer.parseInt(curr[0]);
        arr[i][1] = Integer.parseInt(curr[1]);
      }
      int max = -1;
      for (int i = 0; i < n; ++i) {
        for (int j = i + 1; j < n; ++j) {
          int val = arr[i][0] * arr[j][1] + arr[i][1] * arr[j][0];
          if (val > max) {
            max = val;
          }
        }
      }
      System.out.println(max);
    }
  }
}
