import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CF1798B {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int m = Integer.parseInt(br.readLine());
      String arr[][] = new String[m][];
      int n[] = new int[m];
      for(int i=0; i<m; ++i){
        int ni = Integer.parseInt(br.readLine());
        String ai[] = br.readLine().split(" ");
        arr[i] = ai;
        n[i] = ni;
      }
      HashSet<String> set = new HashSet<String>();
      int flag = 0;
      String ans[] = new String[m];
      for(int i=m-1; i>=0; --i){
        int check[] = new int[n[i]];
        flag = 0;
        for(int j=n[i]-1; j>=0; --j){
          check[j] = 0;
          if(!set.contains(arr[i][j])){
            set.add(arr[i][j]);
            check[j] = 1;
            ans[i] = arr[i][j];
          }
          flag |= check[j];
        }
        if(flag != 1){
          break;
        }
      }
      if(flag != 1){
        System.out.println("-1");
      }
      else{
        for(int i=0; i<m; ++i){
          System.out.print(ans[i] + " ");
        }
        System.out.println();
      }
    }
  }
}

