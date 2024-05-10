import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Repetitions{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		long len = a.length();
		char prev = a.charAt(0);
		long count = 1;
		long max = 1;
		for(int i=1; i<len; ++i){
			if(prev == a.charAt(i)){
				count++;
			}
			if(prev != a.charAt(i) || i == len-1){
				if(max < count){
					max = count;
				}
				count = 1;
			}
			prev = a.charAt(i);
		}
		System.out.println(max);
	}
}
