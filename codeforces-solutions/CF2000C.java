import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CF2000C{
  public static void main(String args[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String arr1[] = br.readLine().split(" ");
      int m = Integer.parseInt(br.readLine());
      for(int i=0; i<m; ++i){
        String a = br.readLine();
        if(a.length() == n){
          HashMap<String,Integer> mapA = new HashMap<String, Integer>();
          HashMap<Character,Integer> mapB = new HashMap<Character, Integer>();
          boolean flag = true;
          for(int j=0; j<n; ++j){
            if(mapA.putIfAbsent(arr1[j],j) == null && mapB.putIfAbsent(a.charAt(j),j) == null){
              continue;
            }
            if(mapA.putIfAbsent(arr1[j],j) != null && mapB.putIfAbsent(a.charAt(j),j) != null){
              if(mapA.get(arr1[j]) == mapB.get(a.charAt(j))){
                continue;
              }
              else{
                flag = false;
                break;
              }
            }
            else{
              flag = false;
              break;
            }
          }
          if(flag){
            System.out.println("YES");
          }
          else{
            System.out.println("NO");
          }
        }
        else{
          System.out.println("NO");
        }
      }
    }
  }
}
