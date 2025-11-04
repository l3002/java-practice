import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF2021B {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String in[] = br.readLine().split(" ");
      int n = Integer.parseInt(in[0]);
      long x = Long.parseLong(in[1]);
      String arr[] = br.readLine().split(" ");
      HashMap<Long,Integer> map = new HashMap<Long,Integer>();
      for(int i=0; i<n; ++i){
        long ai = Long.parseLong(arr[i]);
        if(map.putIfAbsent(ai, 1) != null){
          map.put(ai, map.get(ai) + 1);
        }
      }
      long mex = 0;
      HashMap<Long, Integer> map2 = new HashMap<Long, Integer>();
      for(long i=0; i<=n; ++i){
        long rem = i%x;
        if(!map.containsKey(i)){
          if(map2.get(rem) != null && map2.get(rem) > 0){
            map2.put(rem, map2.get(rem) - 1);
          }
          else{
            mex = i;
            break;
          }
        }
        else{
          if(map2.putIfAbsent(rem, map.get(i) - 1) != null){
            map2.put(rem, map2.get(rem) + map.get(i) - 1);
          }
        }
      }
      System.out.println(mex);
    }
  }
}

