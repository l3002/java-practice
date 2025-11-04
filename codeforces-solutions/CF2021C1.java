import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CF2021C1 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String arr[] = br.readLine().split(" ");
      int n = Integer.parseInt(arr[0]);
      int m = Integer.parseInt(arr[1]);
      String a[] = br.readLine().split(" ");
      String b[] = br.readLine().split(" ");
      int index = 0;
      HashSet<String> set = new HashSet<String>();
      boolean flag = true;
      for(int i=0; i<m; ++i){
        if(set.contains(b[i])){
          continue;
        }
        else if(index < n && a[index].equals(b[i])){
          set.add(b[i]);
          index++;
        }
        else{
          flag = false;
          break;
        }
      }
      if(flag){
        System.out.println("YA");
      }
      else{
        System.out.println("TIDAK");
      }
    }
  }
}

