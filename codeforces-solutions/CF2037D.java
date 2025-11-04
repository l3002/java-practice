import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CF2037D {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String in[] = br.readLine().split(" ");
      int n = Integer.parseInt(in[0]);
      int m = Integer.parseInt(in[1]);
      long L = Long.parseLong(in[2]);
      long l[] = new long[n];
      long r[] = new long[n];
      for(int i=0; i<n; ++i){
        String ai[] = br.readLine().split(" ");
        l[i] = Long.parseLong(ai[0]);
        r[i] = Long.parseLong(ai[1]);
      }
      long x[] = new long[m];
      long v[] = new long[m];
      long current = 1;
      for(int i=0; i<m; ++i){
        String ai[] = br.readLine().split(" ");
        x[i] = Long.parseLong(ai[0]);
        v[i] = Long.parseLong(ai[1]);
      }

      int index = 0;
      int count = 0;
      PriorityQueue<Long> max = new PriorityQueue<>(Collections.reverseOrder());
      boolean flag = true;
      for(int i=0; i<n && flag; ++i){
        if(l[i] - 1 + current <= r[i]){
          for(int j=index; j<m && x[j] < l[i]; ++j,++index){
            max.add(v[j]);
          }
          while(current + l[i] - 1 <= r[i]){
            Long p = max.poll();
            if(p != null){
              current += p;
              count++;
            }
            else{
              flag = false;
              break;
            }
          }
        }
      }
      if(flag){
        System.out.println(count);
      }
      else{
        System.out.println(-1);
      }
    }
  }
}

