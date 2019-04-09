public class Pisica {
    private Pisica() {
    }
    
    
    
    private static final class SingletonHolder {
        public static final Pisica SINGLETON = new Pisica();
    }
    
    public static Pisica getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    /*
    private static Pisica singleton;
    
    public static Pisica getInstance() {
        if (singleton == null) {
            singleton = new Pisica();
        }
        return singleton;        
    }
    */
}