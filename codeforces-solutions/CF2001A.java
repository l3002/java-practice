import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF2001A {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String arr[] = br.readLine().split(" ");
      HashMap<String,Integer> map = new HashMap<String, Integer>();
      for(int i=0; i<n; ++i){
        if(map.putIfAbsent(arr[i],1) != null){
          map.put(arr[i],map.get(arr[i]) + 1);
        }
      }
      int max = 0;
      for(String a : map.keySet()){
        if(map.get(a) > max){
          max = map.get(a);
        }
      }
      System.out.println(n - max);
    }
  }
}
