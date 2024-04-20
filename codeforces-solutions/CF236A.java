import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
  public static void main(String arg[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String t = br.readLine();
    HashSet<Character> a = new HashSet<Character>();
    for (int i = 0; i < t.length(); ++i) {
      a.add(t.charAt(i));
    }
    if (a.size() % 2 == 0) {
      System.out.println("CHAT WITH HER");
    } else {
      System.out.println("IGNORE HIM");
    }
  }
}
