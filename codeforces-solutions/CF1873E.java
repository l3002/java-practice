import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF1873E {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String in[] = br.readLine().split(" ");
      int n = Integer.parseInt(in[0]);
      long x = Long.parseLong(in[1]);
      String arr[] = br.readLine().split(" ");
      HashMap<Long, Integer> map = new HashMap<Long,Integer>();
      for(int i=0; i<n; ++i){
        long ai = Long.parseLong(arr[i]);
        if(map.putIfAbsent(ai,1) != null){
          map.put(ai, map.get(ai) + 1);
        }
      }
      long sumaifi = 0;
      for(long ai: map.keySet()){
        sumaifi += ai*map.get(ai);
      }
      System.out.println((x + sumaifi)/n);
    }
  }
}

