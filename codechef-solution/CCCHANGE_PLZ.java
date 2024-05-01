import java.io.*;

class CCCHANGE_PLZ {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int x = Integer.parseInt(br.readLine());
      System.out.println(((100 - x) / 10) * 10);

    }
  }
}
