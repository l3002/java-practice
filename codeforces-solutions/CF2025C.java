import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CF2025C {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String in[] = br.readLine().split(" ");
      int n = Integer.parseInt(in[0]);
      int k = Integer.parseInt(in[1]);
      String arr[] = br.readLine().split(" ");
      HashMap<Long, Integer> map = new HashMap<Long, Integer>();
      for(int i=0; i<n; ++i){
        Long x = Long.parseLong(arr[i]);
        if(map.putIfAbsent(x,1) != null){
          map.put(x, map.get(x) + 1);
        }
      }
      ArrayList<Long> al = new ArrayList<Long>(map.keySet());
      Collections.sort(al);
      int kx = 1;
      long prev = al.get(0);
      int ps[] = new int[al.size()];
      ps[0] = map.get(prev);
      int max = ps[0];
      int maxOfAll = max;
      for(int i=1; i<al.size(); ++i){
        if(al.get(i) == prev+1){
          ps[i] = ps[i-1] + map.get(al.get(i));
          max = ps[i];
          kx++;
          if(kx > k){
            max -= ps[i-k];
          }
        }
        else{
          max = map.get(al.get(i));
          ps[i] = max;
          kx = 1;
        }
        prev = al.get(i);
        if(max > maxOfAll){
          maxOfAll = max;
        }
      }
      System.out.println(maxOfAll);
    }
  }
}

