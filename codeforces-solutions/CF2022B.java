import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class CF2022B {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String in[] = br.readLine().split(" ");
      int n = Integer.parseInt(in[0]);
      int q = Integer.parseInt(in[1]);
      String arr[] = br.readLine().split(" ");
      HashMap<Long,Long> map = new HashMap<Long,Long>();
      PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
      for(int i=0; i<n; ++i){
        long x = Long.parseLong(arr[i]);
        if(!map.containsKey(x)){
          pq.add(x);
        }
        if(map.putIfAbsent(x, 1L) !=  null){
          map.put(x, map.get(x) + 1);
        }
      }
      long rem = 0;
      long ans = 0;
      while(pq.size() != 0){
        long x = pq.peek();
        long val = map.get(x);
        if(rem == 0){
          ans += x * Math.ceil((double) val/q);
          rem = (x * q) - (val%q) * pq.poll();
        }
        else if(x * val <= rem){
          rem -= x * val;
          pq.poll();
        }
        else{
          long y = x * val - rem;
          if(y/x != 0){
            map.put(x,y/x);
          }
          else{
            pq.poll();
          }
          long nw = y%x;
          if(map.containsKey(nw)){
            map.put(nw,map.get(nw) + 1);
          }
          else{
            map.put(nw,1L);
            pq.add(nw);
          }
          rem = 0;
        }
      }
      System.out.println(ans);
    }
  }
}

