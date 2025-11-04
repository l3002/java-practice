import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF2019 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String in[] = br.readLine().split(" ");
      int n = Integer.parseInt(in[0]);
      int q = Integer.parseInt(in[1]);
      String arr[] = br.readLine().split(" ");
      HashMap<Long, Long> map = new HashMap<Long, Long>();
      for(int i=0; i<n; ++i){
        long x = Long.parseLong(arr[i]);
        long val = i + (n-i-1) + (i*((long)(n-i-1)));
        if(map.putIfAbsent(val,(long)1) != null){
          map.put(val, map.get(val) + 1);
        }
        if(i != n-1){
          long y = Long.parseLong(arr[i+1]);
          long valb = y-x-1;
          val = (i+1)*((long)(n-i-1));
          if(map.putIfAbsent(val,valb) != null){
            map.put(val, map.get(val) + valb);
          }
        }
      }
      String kq[] = br.readLine().split(" ");
      for(int i=0; i<q; ++i){
        Long ki = Long.parseLong(kq[i]);
        Long ans = map.get(ki);
        if(ans == null){
          System.out.print("0 ");
        }
        else{
          System.out.print(ans + " ");
        }
      }
      System.out.println();
    }
  }
}

