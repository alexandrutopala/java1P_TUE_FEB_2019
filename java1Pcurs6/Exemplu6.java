public class Exemplu6 {
    public static void main(String [] args) {
        FacebookChat chat = new FacebookChat();
        User maria = new User("Maria", chat);
        
        User gigel = new User("Gigel", chat);
        User ion = new User("Ion", chat);
        
        chat.addListener(maria);
        chat.addListener(gigel);
        chat.addListener(ion);
        
        maria.sendMessage("Buna");
        
        
        
    }
}