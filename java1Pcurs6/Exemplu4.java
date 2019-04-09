public class Exemplu4 {
    public static void main(String [] args) {
        InputStream is = new InputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        
        String line = bis.readLine();
        System.out.println(line);
        
        
    }
}