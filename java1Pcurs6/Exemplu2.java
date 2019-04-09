public class Exemplu2 {
    public static void main(String [] args) {
        FelDeMancare dulce = 
            FelDeMancare.getInstance(FelDeMancare.Tip.DULCE);
            
        dulce.nume = "pastrav";
        
        FelDeMancare iute =
            FelDeMancare.getInstance(FelDeMancare.Tip.IUTE);
            
        iute.nume = "diavola";
        
        System.out.println(
            FelDeMancare.getInstance(FelDeMancare.Tip.IUTE).nume
        );
        
        System.out.println(
            FelDeMancare.getInstance(FelDeMancare.Tip.DULCE).nume
        );
    }
}