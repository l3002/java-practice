import java.io.*;

class INVEQ {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String a = br.readLine();
      int count0 = 0;
      int count1 = 0;
      char prev = a.charAt(0);
      for (int i = 1; i < n; ++i) {
        if ((prev != a.charAt(i)) && prev == '0') {
          count0++;
        }
        if ((prev != a.charAt(i)) && prev == '1') {
          count1++;
        }
        prev = a.charAt(i);
      }
      if (a.charAt(n - 1) == '0') {
        count0++;
      }
      if (a.charAt(n - 1) == '1') {
        count1++;
      }
      if (count1 < count0) {
        System.out.println(count1);
      } else {
        System.out.println(count0);
      }
    }
  }
}
