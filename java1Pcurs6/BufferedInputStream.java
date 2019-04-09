public class BufferedInputStream {
    private InputStream is;
    
    public BufferedInputStream(InputStream is) {

        this.is = is;
    }
    
    public String readLine() {
        int b = is.readByte();
        System.out.println("converstesc informatia binara");
        return "Hello";
    }
    
}

