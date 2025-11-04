import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF1857F {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new IntputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String arr[] = br.readLine().split(" ");
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      for(int i=0; i<n; ++i){
        if(map.putIfAbsent(arr[i],1) != null){
          map.put(arr[i],map.get(arr[i])+1);
        }
      }
      int q = Integer.parseInt(br.readLine());
      for(int i=0; i<q; ++i){
        HashSet<String> set = new HashSet<String>();
        String arr[] = br.readLine().split(" ");
          long x = Long.parseLong(arr[0]);
          long y = Long.parseLong(arr[1]);
        for(String a : map.keySet()){
          if()
        }
      }
    }
  }
}
