import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class MissingNumber{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long sum = (n*(n+1))/2;
		String[] arr = br.readLine().split(" ");
		long sumOfValues = 0;
		for(int i=0; i<n-1; ++i){
			long a = Long.parseLong(arr[i]);
			sumOfValues+=a;
		}
		System.out.println(sum - sumOfValues);
	}
}
