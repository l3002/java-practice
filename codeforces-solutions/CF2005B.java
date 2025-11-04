import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CF2005B {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String arr[] = br.readLine().split(" ");
      long n = Long.parseLong(arr[0]);
      int m = Integer.parseInt(arr[1]);
      int q = Integer.parseInt(arr[2]);
      String r[] = br.readLine().split(" ");
      long rl[] = new long[m];
      String dq[] = br.readLine().split(" ");
      for(int i=0; i<m; ++i){
        rl[i] = Long.parseLong(r[i]);
      }
      Arrays.sort(rl);
      for(int i=0; i<q; ++i){
        long dqi = Long.parseLong(dq[i]);
        if(dqi > rl[m-1]){
          System.out.println(n - rl[m-1]);
        }
        else if(dqi < rl[0]){
          System.out.println(rl[0] - 1);
        }
        else{
          for(int j=0; j<m-1; ++j){
            if(dqi > rl[i] && dqi < rl[i+1]){
              long val = (long) Math.ceil(((double)(rl[i+1] - rl[i] - 1))/2);
              System.out.println(val);
            }
          }
        }
      }
    }
  }
}

