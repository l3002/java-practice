import java.util.*;
import java.io.*;

public class MXALT {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String[] arr = br.readLine().split(" ");
      int[] arrInt = new int[n];
      for (int i = 0; i < n; ++i) {
        arrInt[i] = Integer.parseInt(arr[i]);
      }
      Arrays.sort(arrInt);
      int half = n / 2;
      int minus = 0;
      int plus = 0;
      for (int i = 0; i < half; ++i) {
        minus += arrInt[i];
      }
      for (int i = half; i < n; ++i) {
        plus += arrInt[i];
      }
      System.out.println(plus - minus);
    }
  }
}
