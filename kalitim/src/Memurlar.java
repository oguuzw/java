public class Memurlar extends Calisan {
    String departman;
    int mesaiSaati;

    public Memurlar(String adSoyad, String ePosta, int telefon, String departman, int mesaiSaati) {
        super(adSoyad, ePosta, telefon);
        this.departman = departman;
        this.mesaiSaati = mesaiSaati;
    }

    @Override
    public String giris(){
        return super.giris() + " B kapisindan";
    }
}

