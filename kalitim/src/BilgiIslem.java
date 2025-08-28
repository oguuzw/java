public class BilgiIslem extends Memurlar {
    String gorev;

    public BilgiIslem(String adSoyad, String ePosta, int telefon, String departman, int mesaiSaati, String gorev) {
        super(adSoyad, ePosta, telefon, departman, mesaiSaati);
        this.gorev = gorev;
    }
}
