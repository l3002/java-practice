import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF2033B {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int m[][] = new int[n][n];
      for(int i=0; i<n; ++i){
        String arr[] = br.readLine().split(" ");
        for(int j=n-1,k=0; j>=0; --j,++k){
          m[i][k] = Integer.parseInt(arr[j]);
        }
      }

      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0; i<n; ++i){
        for(int j=0; j<n; ++j){
          if(map.putIfAbsent(i+j, m[i][j]) != null){
            if(m[i][j] < map.get(i+j)){
              map.put(i+j,m[i][j]);
            }
          }
        }
      }

      long sum = 0;
      for(Integer x: map.keySet()){
        if(map.get(x) < 1){
          sum += Math.abs(map.get(x));
        }
      }
      System.out.println(sum);
    }
  }
}

