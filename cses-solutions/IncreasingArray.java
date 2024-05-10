import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class IncreasingArray{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		long prev = Long.parseLong(arr[0]);
		long cost = 0;
		for(int i=0; i<n; ++i){
			long current = Long.parseLong(arr[i]);
			if(current < prev){
				cost += prev - current;
				continue;
			}
			prev = current;
		}
		System.out.println(cost);
	}
}
