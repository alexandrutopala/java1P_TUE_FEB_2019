import java.util.*;

public class FelDeMancare {
    public static enum Tip {
        DULCE, IUTE
    }
    
    private static Map<Tip, FelDeMancare> registry
                                            = new HashMap<>();
    
    String nume;
    
    private FelDeMancare() {
    }
    
    public static FelDeMancare getInstance(Tip tip) {
        if (registry.get(tip) == null) {
            registry.put(tip, new FelDeMancare());
        }
        return registry.get(tip);
    }
    
    
    
    
    
}