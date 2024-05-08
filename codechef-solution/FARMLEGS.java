import java.util.*;
import java.lang.*;
import java.io.*;

class FARMLEGS {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      int val = (n / 4) + ((n % 4) / 2);
      System.out.println(val);
    }
  }
}
