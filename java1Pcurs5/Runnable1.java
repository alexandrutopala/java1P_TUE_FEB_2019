import java.util.concurrent.*;

public class Runnable1 implements Runnable {
    int x;
    
    Semaphore s = new Semaphore(1, true);
    
    @Override
    public void run() {
        
        for (int i = 0; i < 15; i++) {
            try {
                s.acquire();
                System.out.println(x);
                sleep(50);
                x++;                
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                s.release();
            }
        }
    }
    
    static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
}