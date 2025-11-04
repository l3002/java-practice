import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CF1849B {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String[] inp = br.readLine().split(" ");
      int n = Integer.parseInt(inp[0]);
      long k = Integer.parseInt(inp[1]);
      String[] arr = br.readLine().split(" ");
      HashMap<Long,StringBuilder> map = new HashMap<Long, StringBuilder>();
      for(int i=0; i<n; ++i){
        long ai = Long.parseLong(arr[i]);
        long rem = ai%k;
        StringBuilder val = new StringBuilder();
        val.append(i+1);
        val.append(' ');
        if(rem == 0){
          System.out.print((i+1) + " ");
        }
        else if(map.putIfAbsent(rem, val) != null){
          map.put(rem, map.get(rem).append(val.toString()));
        }
      }
      ArrayList<Long> al = new ArrayList<>(map.keySet());
      Collections.sort(al);
      for(int i=al.size()-1; i>=0; --i){
        System.out.print(map.get(al.get(i)).toString());
      }
      System.out.println();
    }
  }
}

