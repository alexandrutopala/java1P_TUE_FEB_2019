public class Task1 implements Runnable {
    @Override
    public void run() {
        
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(java.time.Instant.now());
        
        for (int i = 1; i <= 25; i += 2) {
            //System.out.println(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}