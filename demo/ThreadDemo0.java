class RunnableClass1 implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100; ++i) {
      System.out.println("Hello from RunnableClass1");
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

}

class RunnableClass2 implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100; ++i) {
      System.out.println("Hello from RunnableClass2");
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

}

public class ThreadDemo0 {

  public static void main(String[] args) {

    Thread t1 = new Thread(new RunnableClass1());
    t1.start();
    Thread t2 = new Thread(new RunnableClass2());
    t2.start();
  }

}
