import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1986B {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String a[] = br.readLine().split(" ");
      int n = Integer.parseInt(a[0]);
      int m = Integer.parseInt(a[1]);
      long arr[][] = new long[n][m];
      for (int i = 0; i < n; ++i) {
        String str[] = br.readLine().split(" ");
        for (int j = 0; j < m; ++j) {
          arr[i][j] = Long.parseLong(str[j]);
        }
      }
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
          int previ = i - 1;
          int prevj = j - 1;
          int nexti = i + 1;
          int nextj = j + 1;
          long max = 0;
          if (nexti < n) {
            if (arr[nexti][j] < arr[i][j]) {
              if (max < arr[nexti][j]) {
                max = arr[nexti][j];
              }
            } else {
              continue;
            }
          }
          if (previ >= 0) {
            if (arr[previ][j] < arr[i][j]) {
              if (max < arr[previ][j]) {
                max = arr[previ][j];
              }
            } else {
              continue;
            }
          }
          if (prevj >= 0) {
            if (arr[i][prevj] < arr[i][j]) {
              if (max < arr[i][prevj]) {
                max = arr[i][prevj];
              }
            } else {
              continue;
            }
          }
          if (nextj < m) {
            if (arr[i][nextj] < arr[i][j]) {
              if (max < arr[i][nextj]) {
                max = arr[i][nextj];
              }
            } else {
              continue;
            }
          }
          arr[i][j] = max;
        }
      }
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}
