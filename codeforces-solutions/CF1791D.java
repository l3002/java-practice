import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CF1791D {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String a = br.readLine();
      HashSet<Character> set = new HashSet<Character>();
      int prefixArr[] = new int[n];
      for(int i=0; i<n; ++i){
        prefixArr[i] = set.size();
        set.add(a.charAt(i));
      }
      set.clear();
      int max = 0;
      for(int i=n-1; i>0; --i){
        set.add(a.charAt(i));
        int val = set.size() + prefixArr[i];
        if(max < val){
          max = val;
        }
      }
      System.out.println(max);
    }
  }
}
