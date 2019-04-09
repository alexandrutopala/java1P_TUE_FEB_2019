public class Exemplu3 {
    public static void main(String [] args) {
        Casa c = new Casa.Builder()
                    .setUsi(4)
                    
                    .setCamere(3)
                    .setAdresa("Bd. 1 Mai, nr. 45")
                    .build();
    }
}