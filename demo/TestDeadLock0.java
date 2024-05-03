public class TestDeadLock0 {
  public static void main(String[] args) {
    final String resource1 = "resource1";
    final String resource2 = "resource2";
    Thread t1 = new Thread() {
      public void run() {
        synchronized (resource1) {
          System.out.println("Thread 1 : Locked resources 1");
          try {
            Thread.sleep(100);
          } catch (Exception e) {
            System.out.println(e);
          }
          synchronized (resource2) {
            System.out.println("Thread 1: Locked resources 2");
          }
        }
      }
    };
    Thread t2 = new Thread() {
      public void run() {
        synchronized (resource2) {
          System.out.println("Thread 2 : Locked resources 2");
          synchronized (resource1) {
            System.out.println("Thread 2 : Locked resources 1");
          }
        }
      }
    };
    t1.start();
    t2.start();
  }
}
