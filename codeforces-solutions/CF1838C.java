import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1838C {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String in[] = br.readLine().split(" ");
      int n = Integer.parseInt(in[0]);
      int m = Integer.parseInt(in[1]);
      int prime[] = new int[1000];
      for (int i = 0; i < 1000; ++i) {
        prime[i] = 0;
      }

      for (int i = 2; i * i <= 1000; ++i) {
        if (prime[i - 1] == 0) {
          int val = 2 * i;
          while (val <= 1000) {
            prime[val - 1] = 1;
            val += i;
          }
        }
      }

      if (prime[n - 1] == 1) {
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < m; ++j) {
            System.out.print((i + 1 + j * n) + " ");
          }
          System.out.println();
        }
      } else if (prime[m - 1] == 1) {
        int count = 1;
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < m; ++j) {
            System.out.print(count + " ");
            count++;
          }
          System.out.println();
        }
      } else {
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < m; j += 2) {
            System.out.print((j * n + i + 1) + " ");
          }
          for (int j = 1; j < m; j += 2) {
            System.out.print((j * n + i + 1) + " ");
          }
          System.out.println();
        }
      }
    }
  }
}
