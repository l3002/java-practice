import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class CF1742E {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String arr[] = br.readLine().split(" ");
      int n = Integer.parseInt(arr[0]);
      int q = Integer.parseInt(arr[1]);
      String a[] = br.readLine().split(" ");
      String k[] = br.readLine().split(" ");
      long al[] = new long[n];
      long prefixa[] = new long[n];
      long kl[] = new long[q];
      long sum = 0;
      for(int i=0; i<n; ++i){
        al[i] = Long.parseLong(a[i]);
        sum += al[i];
        prefixa[i] = sum;
      }
      for(int i=0; i<q; ++i){
        kl[i] = Long.parseLong(k[i]);
      }
      Arrays.sort(kl);
      HashMap<Long,Integer> map = new HashMap<Long,Integer>();
      int j = 0;
      for(int i=0; i<q; ++i){
        while(j < n && al[j] <= kl[i]){
          j++;
        }
        map.put(kl[i],j-1);
      }

      for(int i=0; i<q; ++i){
        long ki = Long.parseLong(k[i]);
        if(map.get(ki) == -1){
          System.out.print("0 ");
        }
        else{
          System.out.print(prefixa[map.get(ki)] + " ");
        }
      }
      System.out.println();
    }
  }
}

