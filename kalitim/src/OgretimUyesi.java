public class OgretimUyesi extends Akademisyen {
    String unvan;

    public OgretimUyesi(String adSoyad, String ePosta, int telefon, String bolum, String ders, String gorev, String unvan) {
        super(adSoyad, ePosta, telefon, bolum, ders, gorev);
        this.unvan = unvan;
    }

    @Override
    public String giris(){
        return this.unvan + " " + super.giris();
    }

    @Override
    public void derseGir(){
        System.out.println(getAdSoyad() + " " + getDers() + " dersine girdi.");
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
