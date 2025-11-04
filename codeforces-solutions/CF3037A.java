import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF3037A {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String arr[] = br.readLine().split(" ");
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0; i<n; ++i){
        int ai = Integer.parseInt(arr[i]);
        if(map.putIfAbsent(ai,1) != null){
          map.put(ai,map.get(ai) + 1);
        }
      }

      int score = 0;
      for(int ai : map.keySet()){
        score += map.get(ai)/2;
      }

      System.out.println(score);
    }
  }
}

