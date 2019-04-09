public class User implements Listener {
    String nume;
    FacebookChat chat;
    
    
    public User(String nume, FacebookChat chat) {        
        this.nume = nume;
        this.chat = chat;
    }
    
    public void sendMessage(String msg) {
        chat.notifyListeners(msg);
    }
    
    @Override
    public void notifyListener(String msg) {
        System.out.println(nume + " : " + msg);
    }
}




