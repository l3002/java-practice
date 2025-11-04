import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

public class CF2030D {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String in[] = br.readLine().split(" ");
      int n = Integer.parseInt(in[0]);
      int q = Integer.parseInt(in[1]);
      String arr[] = br.readLine().split(" ");
      int first = -1;
      boolean f = true;
      int last = -1;
      for (int i = 0; i < n; ++i) {
        int x = Integer.parseInt(arr[i]);
        if (x != i + 1) {
          if (f) {
            first = i;
            f = false;
          }
          last = i;
        }
      }
      String s = br.readLine();
      PriorityQueue<Integer> rq = new PriorityQueue<Integer>(Collections.reverseOrder());
      PriorityQueue<Integer> lq = new PriorityQueue<Integer>();
      for (int i = first; i <= last && i != -1; ++i) {
        if (s.charAt(i) == 'R') {
          rq.add(i + 1);
        }
        if (s.charAt(i) == 'L') {
          lq.add(i + 1);
        }
      }

      boolean flag = false;

      int rqp = -1;
      int lqp = n;

      if (rq.peek() != null) {
        rqp = rq.peek();
      }
      if (lq.peek() != null) {
        lqp = lq.peek();
      }

      if (rqp < lqp) {
        flag = true;
      }

      for (int i = 0; i < q; ++i) {
        Integer x = Integer.parseInt(br.readLine());
        if (x >= first && x <= last) {
          if (s.charAt(x - 1) == 'R') {
            rq.remove(x);
            lq.add(x);
          } 
          else {
            lq.remove(x);
            rq.add(x);
          }

          rqp = -1;
          lqp = n;

          if (rq.peek() != null) {
            rqp = rq.peek();
          }
          if (lq.peek() != null) {
            lqp = lq.peek();
          }

          if (rqp < lqp){
            flag = true;
          }
          else {
            flag = false;
          }
        }

        if (flag) {
          System.out.println("YES");
        } 
        else {
          System.out.println("NO");
        }
      }
    }
  }
}
