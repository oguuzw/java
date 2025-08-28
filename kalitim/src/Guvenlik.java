public class Guvenlik extends Memurlar {
    String belge;

    public Guvenlik(String adSoyad, String ePosta, int telefon, String departman, int mesaiSaati, String belge) {
        super(adSoyad, ePosta, telefon, departman, mesaiSaati);
        this.belge = belge;
    }
}
