import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class cf2024B {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String in[] = br.readLine().split(" ");
      int n = Integer.parseInt(in[0]);
      long k = Long.parseLong(in[1]);
      String arr[] = br.readLine().split(" ");
      HashMap<Long, Integer>  map = new HashMap<Long,Integer>();
      int z = 0;
      for(int i=0; i<n; ++i){
        long x = Long.parseLong(arr[i]);
        if(x != 0 && map.putIfAbsent(x, 1) != null){
          map.put(x,map.get(x) + 1);
        }
        if(x == 0){
          z++;
        }
      }
      ArrayList<Long> al = new ArrayList<Long>(map.keySet());
      Collections.sort(al);
      long rem = k;
      long ans = 0;
      long curr = n - z;
      long sum = 0;
      for(Long x : al){
        if(curr * (x-sum) < rem){
          ans += curr * (x-sum);
          rem -= curr * (x-sum);
          sum += x - sum;
          curr -= map.get(x);
          if(curr >= rem){
            ans += rem + map.get(x);
            break;
          }
          else{
            ans += curr + map.get(x);
            rem -= curr;
            sum++;
          }
        }
        else{
          ans += rem;
          break;
        }
      }
      ans += z;
      System.out.println(ans);
    }
  }
}

