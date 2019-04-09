public class Exmeplu5 {
    public static void main(String [] args) {
        Path p1 = Paths.get(Paths.OS.WINDOWS);
        Path p2 = Paths.get(Paths.OS.LINUX);
        
        System.out.println(p1.getRoot());
        System.out.println(p2.getRoot());
    }
}