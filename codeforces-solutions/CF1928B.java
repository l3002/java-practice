import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class CF1928B {
  public static int binarysearch(ArrayList<Long> al, long x, int low) {
    int high = al.size() - 1;
    while (low < high) {
      int mid = low + ((high - low + 1) / 2);
      if (al.get(mid) < x) {
        low = mid + 1;
      } else if (al.get(mid) > x) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return low;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String arr[] = br.readLine().split(" ");
      HashSet<Long> set = new HashSet<Long>();
      ArrayList<Long> al = new ArrayList<Long>();
      for (int i = 0; i < n; ++i) {
        long x = Long.parseLong(arr[i]);
        if (!set.contains(x)) {
          al.add(x);
          set.add(x);
        }
      }
      Collections.sort(al);
      int max = 1;
      for (int i = 0; i < al.size() - 1; ++i) {
        int val = binarysearch(al, al.get(i) + n, i);
        if (val > al.size() - 1) {
          val = al.size() - 1;
        }
        if (al.get(val) >= al.get(i) + n) {
          val--;
        }
        int maxE = val - i + 1;
        if (max < maxE) {
          max = maxE;
        }
      }
      System.out.println(max);
    }
  }
}
