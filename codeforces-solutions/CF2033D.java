import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
 
public class CF2033D{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){

            int n = Integer.parseInt(br.readLine());
            String arr[] = br.readLine().split(" ");
            long sum = 0;

            HashSet<Long> set = new HashSet<Long>();
            set.add(0L);
            int count = 0;

            for(int i=0; i<n; ++i){
                long ai = Long.parseLong(arr[i]);
                sum += ai;
                if(set.contains(sum)){
                    count++;
                    set.clear();
                }
                else{
                    set.add(sum);
                }
            }

            set.clear();
            set.add(0L);
            sum = 0;
            int countb = 0;
            for(int i=n-1; i>=0; --i){
                long ai = Long.parseLong(arr[i]);
                sum += ai;
                if(set.contains(sum)){
                    countb++;
                    set.clear();
                }
                else{
                    set.add(sum);
                }
            }
            if(count < countb){
              System.out.println(countb);
            }
            else{
              System.out.println(count);
            }
        }
    }
}
