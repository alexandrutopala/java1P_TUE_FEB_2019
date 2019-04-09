public class Casa {
    int etaje;
    int bai;
    
    int camere;
    int usi;
    String adresa;
    
    public static class Builder {
        private Casa instance = new Casa();
        
        public Builder setEtaje(int etaje) {
            instance.etaje = etaje;
            return this;
        }
        
        public Builder setBai(int bai) {
            instance.bai = bai;
            return this;
        }
        
        public Builder setCamere(int camere) {
            instance.camere = camere;
            return this;
        }
        
        public Builder setUsi(int usi) {
            instance.usi = usi;
            return this;
        }
        
        public Builder setAdresa(String adresa) {
            instance.adresa = adresa;
            return this;
        }
        
        public Casa build() {
            return instance;
        }
    } 
    
    
}



