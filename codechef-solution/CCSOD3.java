import java.io.*;

class CCSOD3 {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String[] arr = br.readLine().split(" ");
      long a1 = Long.parseLong(arr[0]);
      long a2 = Long.parseLong(arr[1]);
      long lowerDiv = a1;
      if ((a1 % 3) == 1) {
        lowerDiv += 2;
      }
      if ((a1 % 3) == 2) {
        lowerDiv += 1;
      }
      long upperDiv = a2 - (a2 % 3);
      if (a1 % 3 != 0 && a2 % 3 != 0 && a2 - a1 <= 1) {
        System.out.println(0);
      } else {
        System.out.println(((upperDiv - lowerDiv) / 3) + 1);
      }
    }
  }
}
