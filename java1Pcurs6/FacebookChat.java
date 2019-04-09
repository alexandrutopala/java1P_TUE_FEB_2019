import java.util.*;

public class FacebookChat {
    private List<Listener> listeners = new ArrayList<>();
    
    public void notifyListeners(String msg) {
        listeners.stream()
                 .forEach(l -> l.notifyListener(msg));
    }
    
    public void addListener(Listener l) {
        listeners.add(l);
    }
    
}