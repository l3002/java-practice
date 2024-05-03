public class TestExecCommand {
  public static void main(String[] args) throws Exception {
    Process newProcess = Runtime.getRuntime().exec("systemctl start ufw", null, null);
  }
}
