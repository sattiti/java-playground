import java.lang.Runnable;

public class ThreadRunnable{
  public final static int PERIOD = 1000;

  public Thread getThread(){
    return new Thread(new Runnable(){
      private Thread _currentThread = null;

      @Override
      public void run(){
        _currentThread = Thread.currentThread();

        for(int i = 0; i < 20; i++) {
          System.out.println(_currentThread.getName() + " : " + i);
          try {
            _currentThread.sleep(PERIOD);
          }
          catch(Exception e) {
            e.printStackTrace();
          }
        }
      }
    });
  }
}

public class ThreadTest extends Thread{
  public ThreadTest(){}

  public void run(){
    for(int n = 0; n < 1000; n++) {
      System.out.print('#');
    }
  }
}


public static void main(String[] args){
  ThreadTest t = new ThreadTest();
  t.start();
  for(int n = 0; n < 1000; n++){
    System.out.print('-');
  }

  ThreadSample t = new ThreadSample();
  t.getThread().start();
  t.getThread().start();
  t.getThread().start();
}
