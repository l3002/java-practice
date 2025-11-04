import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF2053B {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int a[][] = new int[n][2];
      HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
      for(int i=0; i<n; ++i){
        String arr[] = br.readLine().split(" ");
        a[i][0] = Integer.parseInt(arr[0]);
        a[i][1] = Integer.parseInt(arr[1]);
        if(a[i][1] - a[i][0] == 0 && map.putIfAbsent(a[i][1], 1) != null){
          map.put(a[i][1], map.get(a[i][1])+1);
        }
      }
      StringBuilder ans = new StringBuilder();
      for(int i=0; i<n; ++i){
        if(a[i][1] - a[i][0] == 0 && map.get(a[i][1]) > 1){
          ans.append("0");
        }
        else if(a[i][1] - a[i][0] > 0){
          int max = a[i][1] - a[i][0] + 1; 
          for(Integer key : map.keySet()){
            if(key <= a[i][1] && key >= a[i][0]){
              max--;
            }
          }
          if(max == 0){
            ans.append("0");
          }
          else{
            ans.append("1");
          }
        }
        else{
          ans.append("1");
        }
      }
      System.out.println(ans);
    }
  }
}

